package com.sist.client;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import com.sist.common.Function;
//패키지가 틀리기 때문에 임포트했음 
import com.sist.dao.*;
// 서버 연결 
import java.util.*;
import java.net.*;
import java.io.*;
public class MainForm extends JFrame implements ActionListener,Runnable,MouseListener{ // <== extends Activity로 바꾸면 안드로이드임! 세상에 
   
	// 이미 JFrame 상속 받았으므로 상속 불가 ==> 쓰레드 상속 불가능하므로 implements Runnable 한다! 
	Login login=new Login();
	WaitRoom wr=new WaitRoom();
   GameRoom gr=new GameRoom();
   MakeRoom mr=new MakeRoom();
   CardLayout card=new CardLayout(); // 윈도우 창은 그대로 냅두고 tab 변경하기 위해서. 

   // 서버 연결과 관련된 라이브러리
   Socket s;// 서버연결
   OutputStream out;// 서버로 데이터 전송 (요청)
   BufferedReader in;// 서버에서 응답한 데이터를 받는다 
	/*
	 * 1) 유저가 직접 보내는 데이터 => 이벤트 발생 
	 *  - ex) 버튼 클릭 등 ==> 이런 이벤트가 발생할 때마다 서버에 보내주면 됨. 
	 *        ==> 그러면 서버에서 받아서 관련된 사람들한테 메세지를 날려줌. 
	 * 2) 서버에서 들어오는 데이터 => Thread => 출력 (Function) 
	*/
   String myRoom,myId;
   
   MainForm() {
	 //위에 있을수록 창이 먼저 뜬다 
	  setLayout(card);
	  add("LOGIN",login);
	  add("WR",wr);
	  add("GAME",gr);
	  setBounds(448,216,1024, 768); // MainForm을 띄울 좌표 설정 
	  setVisible(true);// 윈도우 보여라 
	  
	  setResizable(false); // 창 크기 수정 불가능하게 (최대화 버튼도 비활성화됨) 
	  setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // X버튼 못 누르게 	
	  login.b1.addActionListener(this);
	  wr.tf.addActionListener(this);
	  wr.b6.addActionListener(this); // 대기실 나가기 버튼  
	  wr.b1.addActionListener(this); // 대기실 방만들기 버튼
	  
	  mr.b1.addActionListener(this); // 방만들기 버튼 => JDialog의 '방만들기' 버튼  
	  mr.b2.addActionListener(this); //  방만들기 버튼 => JDialog의 '취소 버튼 
	  
	  wr.table1.addMouseListener(this); // 대기실 방리스트
	  
	  gr.tf.addActionListener(this); // 게임룸 채팅
	  gr.b5.addActionListener(this); // 게임룸 방나가기 버튼
	  gr.b2.addActionListener(this); // 강퇴 버튼 
   }
   public static void main(String[] args) {
	   try
	   {
   		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
			JFrame.setDefaultLookAndFeelDecorated(true);
		}
		catch(Exception e){}
	    new MainForm();
	    
   }
  
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b1) // 로그인버튼 클릭 시 
		{
			String id=login.tf.getText();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this, "ID를 입력하세요");
				login.tf.requestFocus();
				return;
			}
			
			String pwd=String.valueOf(login.pf.getPassword()); 
			// 비밀번호는 반드시 , getTExt가아니라 getPassword로 갖고 와야!!
			if(pwd.length()<1)
			{
				JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");
				login.pf.requestFocus(); //강제로 포커스 줌 
				return;
			}
			
			// 처리
			MemberDAO dao=new MemberDAO();
			String result=dao.isLogin(id, pwd);
			if(result.equals("NOID"))
			{
				JOptionPane.showMessageDialog(this, "ID가 존재하지 않습니다");
				login.tf.setText("");
				login.pf.setText("");
				login.tf.requestFocus();
			}
			else if(result.equals("NOPWD"))
			{
				JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다");
				login.pf.setText("");
				login.pf.requestFocus();
			}
			else
			{
				connection(result);
			}
		}
		else if(e.getSource()==wr.tf)// 대기실채팅
		{
			// 입력된 문자열 읽기
			String msg=wr.tf.getText();
			if(msg.length()<1)// 입력이 안된 경우
			{
				wr.tf.requestFocus();
				return;
			}
			
			// 서버로 전송 
			// if문에 안 걸렸음 ==> 정상적으로 메시지 입력한 경우  ==> 서버로 전송
			try
			{
				out.write((Function.WAITCHAT+"|"+msg+"\n").getBytes());
			}catch(Exception ex) {}
			
			wr.tf.setText("");
		}
		// 나가기(대기실)
		// 대기실 나가기 버튼 클릭 시 ==> 서버는 Socket을 끊고, Vector를 지운다. 
		else if(e.getSource()==wr.b6)
		{
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
				/*
				 * 나가기 => 요청 
				 *         ===
				 *         처리 ==> 서버가 처리해줌. 
				 *         결과출력 ==> 클라이언트가 결과 출력. 
				*/
			}catch(Exception ex) {}
		}
		else if(e.getSource()==wr.b1) // 방만들기 버튼 클릭 시
		{
			mr.tf.setText("");
			// 매번 창을 새로 생성하는게 아니므로, 이전 값이 남아있으니, 버튼 누를때마다 값 비워줘야함 
			// 빈 상태로 만들기 위하여
			mr.rb1.setSelected(true);
			mr.box.setSelectedIndex(0);
			mr.la4.setVisible(false);
			mr.pf.setVisible(false);
			mr.pf.setText("");
			mr.tf.requestFocus();
			mr.setVisible(true);
		}
		else if(e.getSource()==mr.b1)
		{
			// 1. 방이름 
			String rn=mr.tf.getText();
			if(rn.length()<1)
			{
				JOptionPane.showMessageDialog(this, "방이름을 입력하세요");
				mr.tf.requestFocus();
				return;
			}
			
			for(int i=0;i<wr.model1.getRowCount();i++)
			{
				String roomName=wr.model1.getValueAt(i, 0).toString();
				if(rn.equals(roomName))
				{
					JOptionPane.showMessageDialog(this,
							"이미 존재하는 방입니다\n다시입력하세요");
					mr.tf.setText("");
					mr.tf.requestFocus();
					return;
				}
			}
			
			// 공개 비공개
			String rs=""; // 상태 (room status)
			String rp=""; // 비밀번호 (room pwd) 
			if(mr.rb1.isSelected())
			{
				rs="공개";
				rp=" "; //반드시 공백 하나 줘야함!★  ""해버리면 null로 인식해서... 없을 때 방 만들 수가 없음 
			}
			else
			{
				rs="비공개";
				rp=String.valueOf(mr.pf.getPassword());
			}
			
			// 인원체크
			int inwon=mr.box.getSelectedIndex()+2;
			// mr에서 box를 만들 때, 인원수를 2명부터 시작하게 만들어놔서 '+2' 한거임. 
			// (index는 항상 0부터 시작하니까, index=0일때 인원수2명 이렇게 되니까...) 
						
			
			// 서버로 전송 
			try
			{
				out.write((Function.MAKEROOM+"|"+rn+"|"
			                +rs+"|"+rp+"|"+inwon+"\n").getBytes());
			}catch(Exception ex) {}
            mr.setVisible(false);			
			
		}
		else if(e.getSource()==mr.b2)
		{
			mr.setVisible(false);
		}
		// 게임창 채팅 - 방에 있는 사람들에게 메시지를 전송 
		else if(e.getSource()==gr.tf)
		{
			String msg=gr.tf.getText();
			if(msg.length()<1)
				return;
			try
			{
				out.write((Function.ROOMCHAT+"|"+myRoom+"|"+msg+"\n").getBytes()); // out.write(); ==> 서버로 값이 넘어감 
				// 방 이름이 넘어가야 방에 있는 사람들에게만 채팅메시지 보낼 수 있음
				// 방 이름 중복되지 않게 해놨으니까 가능
				// 방 안에 userVc있으니까 방에 들어간 사람 찾을 수 있음! 
				// 방 찾으려고 myroom이라고 전역변수 만들어놓았음 
			}catch(Exception ex) {}
			
			gr.tf.setText(""); // 채팅입력창 비워준다
		}
		else if(e.getSource()==gr.b5) // 방 나가기 버튼 클릭 
		{
			try
			{
				out.write((Function.ROOMOUT+"|"+myRoom+"\n").getBytes());
			}catch(Exception ex) {}
		}
		else if(e.getSource()==gr.b2) // 강퇴버튼 클릭
		{
			String youId=gr.box.getSelectedItem().toString(); // getSelectedItem: 선택한콤보박스 값을 가져옴
			try
			{
				out.write((Function.KANG+"|"+myRoom+"|"+youId+"\n").getBytes());
			}catch(Exception ex) {}
		}
		
	}
	// actionPerformed end
	
	// 서버랑 연결 - 로그인 버튼 눌렀을 때 호출시키면 됨 
	public void connection(String userData)
	{
		try
		{
			s=new Socket("localhost",3355); // 소켓 연결 : '전화걸기' 같은 역할! 나중에 "localhost"를 "서버 컴터 IP"로 바꾸면 됨
			// 송신(OutputStream) / 수신(BufferedReader)  
			// 참고) 송신은 항상 유저가, 수신은 항상 쓰레드가. 
			
			out=s.getOutputStream();
			// 1바이트 전송인데 한글(2byte)라서 1byte로 변경  (원래 네트웤 통신의 단위는 1바이트임)		
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			// 로그인 데이터 보내기 
			// 100|hong|홍길동|남자|대기실\n   이렇게 넘어감
			out.write((Function.LOGIN+"|"+userData+"\n").getBytes());
		}catch(Exception ex) {}
		// 서버로부터 데이터를 읽기 시작 
		new Thread(this).start();
	}
	
	// 서버로부터 데이터를 수신하는 기능 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 수신했을 때 어떻게 처리할 것인가 (쓰레드)
		try
		{
			while(true)
			{
				// 100|hong|홍길동|남자|대기실\n
				// msg가 서버에서 위와 같은 형식으로 날아옴 
				String msg=in.readLine();
				System.out.println("Server=>"+msg);
				StringTokenizer st=new StringTokenizer(msg,"|"); // StringTokenizer로 | 기준으로 글자 자른다. 
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
				  case Function.LOGIN:
				  {
					  String[] data= {
						 st.nextToken(), // id
						 st.nextToken(), // 이름
						 st.nextToken(), // 성별
						 st.nextToken()  // 위치
					  };
					  wr.model2.addRow(data); //model2가 두번째 테이블(유저리스트)임!
					  break;
				  }
				  
				  case Function.MYLOG: //서버에서 MYLOG(창 바꿔라)고 말하면 수행해줌 
				  {
					  String id=st.nextToken();
					  setTitle(id);
					  card.show(getContentPane(), "WR");
					  break;
				  }
				  
				  case Function.WAITCHAT:
				  {
					  wr.tp.append(st.nextToken()+"\n");
					  break;
				  }
				  
				  case Function.EXIT: // 종료처리 - to 남아 있는 사람 
				  {
					  String id=st.nextToken();
					  for(int i=0;i<wr.model2.getRowCount();i++)  // 테이블에 저장된 행(줄)의 갯수를 세서, 한 줄 한 줄 검색해봄 
					  {
						  String mid=wr.model2.getValueAt(i,0).toString(); 
						  // getValueAt : 값을 읽어옴
						  // getValueAt(i,0) : id는 열의 첫번째(열번호 0)에 있으니까
						  // toString : getValueAt이 리턴형이 Object여서 얘를 String으로 변경시켜줘야함
						  if(mid.equals(id))
						  {
							  wr.model2.removeRow(i);
							  break;
						  }
					  }
					  break;
				  }
				  
				  case Function.MYEXIT: // 종료처리 - to 나가는 사람
				  {
					  dispose();// 메모리 회수
					  System.exit(0);// 프로그램 종료
				  }
				  
				  case Function.MAKEROOM:
				  {
					 String[] data= {
						st.nextToken(), // 방이름
						st.nextToken(), // 상태(공개/비공개)
						st.nextToken()  // 인원 1/6
					 };
					 wr.model1.addRow(data); // 가변형이니까 add 할 때마다 한 줄 씩 늘어남 
					 break;  
				  }
				  
				  case Function.ROOMIN:
				  {
					  /*
					   *  Function.ROOMIN+"|"+room.roomName+"|"
								   +id+"|"+sex+"|"+avatar
					   */
					  myRoom=st.nextToken();
					  String id=st.nextToken();
					  String sex=st.nextToken();
					  String avatar=st.nextToken();
					  String bang=st.nextToken();
					  myId=id;
					  
					  String temp="";
					  if(sex.equals("남자"))
					  {
						  temp="m"+avatar; // m1.png,m2.png...
					  }
					  else
					  {
						  temp="w"+avatar; // w1.png,w2.png
					  }
					  
					  // 화면 이동 
					  card.show(getContentPane(), "GAME");
					  for(int i=0;i<6;i++)
					  {
						  if(gr.sw[i]==false)
						  {
							  gr.sw[i]=true;
							  gr.pans[i].removeAll();
							  gr.pans[i].setLayout(new BorderLayout());
							  gr.pans[i].add("Center",new JLabel(new ImageIcon(gr.getImageSizeChange(new ImageIcon("c:\\image\\"+temp+".png"), 150, 120))));
							  gr.pans[i].validate();
							  gr.ids[i].setText(id);
							  break;
						  }
					  }
					  
					 for(int i=0;i<6;i++)
						  {
							  String bid=gr.ids[i].getText();
							  if(bid.equals(bang))
							  {
								  gr.ids[i].setBackground(Color.green);
								  gr.b1.setEnabled(true);
								  gr.b2.setEnabled(true);
								  gr.b3.setEnabled(true);
								  gr.b4.setEnabled(true);
							  }
						  }
					 
					 
					  break;
				  }
				  
				  case Function.ROOMADD:
				  {
					  String id=st.nextToken();
					  String sex=st.nextToken();
					  String avatar=st.nextToken();
					  String bang=st.nextToken();
					  String temp="";
					  if(sex.equals("남자"))
					  {
						  temp="m"+avatar; // m1.png,m2.png...
					  }
					  else
					  {
						  temp="w"+avatar; // w1.png,w2.png
					  }
					  for(int i=0;i<6;i++)
					  {
						  if(gr.sw[i]==false)
						  {
							  gr.sw[i]=true;
							  gr.pans[i].removeAll();
							  gr.pans[i].setLayout(new BorderLayout());
							  gr.pans[i].add("Center",new JLabel(new ImageIcon(gr.getImageSizeChange(new ImageIcon("c:\\image\\"+temp+".png"), 150, 120))));
							  gr.pans[i].validate();
							  gr.ids[i].setText(id);
							  break;
						  }
					  }
					  for(int i=0;i<6;i++)
					  {
						  String bid=gr.ids[i].getText();
						  if(bid.equals(bang))
						  {
							  gr.ids[i].setBackground(Color.green);
							  gr.b1.setEnabled(true);
							  gr.b2.setEnabled(true);
							  gr.b3.setEnabled(true);
							  gr.b4.setEnabled(true);
						  }
					  }
					  gr.box.addItem(id);
					  break;
				  }
				  
				  case Function.ROOMCHAT:
				  {
					  gr.ta.append(st.nextToken()+"\n");
					  break;
				  }
				  
				  case Function.WAITUPDATE:
				  {
					// 대기실 갱신 
					  // 서버에서 보낸 값: Function.WAITUPDATE+"|"+room.roomName+"|"+room.current+"|"+room.maxcount+"|"+id+"|"+pos
					  String rn=st.nextToken();
					  String current=st.nextToken();
					  String maxcount=st.nextToken();
					  String id=st.nextToken();
					  String pos=st.nextToken();
					  
					  //테이블에서 방을찾는다. 
					  for(int i=0; i<wr.model1.getRowCount(); i++) //getRowCount : row의 갯수 
					  {
						  String roomName=wr.model1.getValueAt(i, 0).toString();
						  if(rn.equals(roomName))
						  {
							  if(Integer.parseInt(current)==0)
							  {
								  wr.model1.removeRow(i);
							  }
							  else 
							  {
								  wr.model1.setValueAt(current+"/"+maxcount, i, 2);
							  }
							  break;
						  }
					  }
					  // 접속자 목록 변경
					  for(int i=0; i<wr.model2.getRowCount();i++)
					  {
						  String mid=wr.model2.getValueAt(i, 0).toString();
						  if(mid.equals(id))
						  {
							  wr.model2.setValueAt(pos, i, 3);
							  break;
						  }
					  }
					  break;
				  }
				  
				  case Function.POSCHANGE:
				  {
					  String id=st.nextToken();
					  String pos=st.nextToken();
					  // 접속자 목록 변경
					  for(int i=0; i<wr.model2.getRowCount();i++)
					  {
						  String mid=wr.model2.getValueAt(i, 0).toString();
						  if(mid.equals(id))
						  {
							  wr.model2.setValueAt(pos, i, 3);
							  break;
						  }
					  }
					  break;
				  }
				  
				  case Function.ROOMOUT: // 방에 남아있는 사람에 대한 처리 - 나는 남아있는데 다른 애가 방 나갔음 
				  {
					  String id=st.nextToken();
					  for(int i=0;i<6;i++)
					  {
						  String mid=gr.ids[i].getText(); // 나가는 사람 id
						  if(id.equals(mid))  // 나가는 사람 제거 
						  {
							gr.sw[i] = false;
							gr.pans[i].removeAll();
							gr.pans[i].setLayout(new BorderLayout());
							gr.pans[i].add("Center", new JLabel(new ImageIcon(
									gr.getImageSizeChange(new ImageIcon("c:\\image\\def.png"), 150, 120))));
							gr.pans[i].validate();
							gr.ids[i].setText("");
						  }
					  }
					  break;
				  }
				  
				  case Function.MYROOMOUT: // 내가 방을 나감 
				  {
					  // 초기화 
					  // MainForm에서 new로 GameRoom 만들어서 들어감
					  // GameRoom에서 빠져나와서 다른 GameRoom 들어가면 이전 데이터(이전 방에 들어있던 유저와 채팅내용)가 남아있음
					  // ===> 비워줘야
					  // 게임룸에 남아있는 정보 모두를 다 비워줘야함 (게임방에 들어있던 유저들, 채팅들 - 데이터 모두 비워줘야) 
					  for(int i=0; i<6; i++)
					  {
						gr.sw[i] = false;
						gr.pans[i].removeAll();
						gr.pans[i].setLayout(new BorderLayout());
						gr.pans[i].add("Center", new JLabel(new ImageIcon(
								gr.getImageSizeChange(new ImageIcon("c:\\image\\def.png"), 150, 120))));
						gr.pans[i].validate();
						gr.ids[i].setText("");
					  }
					  gr.ta.setText("");
					  gr.tf.setText("");
					  card.show(getContentPane(), "WR");
					  break;
				  }
				  case Function.KANG:
				  {
					  String rn=st.nextToken();
					  JOptionPane.showMessageDialog(this, rn+"방에서 강퇴되었습니다.");
					  out.write((Function.ROOMOUT+"|"+rn+"\n").getBytes());
					  break;
				  }
				  
				}
				
			}
		}catch(Exception ex) {}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==wr.table1)
		{
			if(e.getClickCount()==2)// 더블 클릭 
			{
				// 방이름 
				int row=wr.table1.getSelectedRow();  // getSelectedRow : 선택한 row를 가지고옴 
				String rn=wr.model1.getValueAt(row,0).toString();
				String inwon=wr.model1.getValueAt(row,2).toString();
				//String state=wr.model1.getValueAt(row, 1).toString();
				StringTokenizer st=new StringTokenizer(inwon,"/");
				// 1/5
				int no1=Integer.parseInt(st.nextToken());// 1
				int no2=Integer.parseInt(st.nextToken());// 5
				if(no1==no2) // 방에 들어갈 수 X
				{
					JOptionPane.showMessageDialog(this, 
							"이미 방인원이 찼습니다\n다른 방을 선택하세요");
				}
				else // 방에 들어갈 수 O
				{
					try
					{
						out.write((Function.ROOMIN+"|"+rn+"\n").getBytes());
					}catch(Exception ex) {}
				}
				
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
