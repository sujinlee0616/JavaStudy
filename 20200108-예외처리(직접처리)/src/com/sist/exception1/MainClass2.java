package com.sist.exception1;
/*
 * <try catch를 이용한 예외처리>
 * 
 * 1. 형식
 * 	try
 * 	{
 * 		평상시 소스 내용 (정상 실행이 가능한 소스)
 * 		try를 수행하면서  에러가 발생하면 해당 catch를 찾아서 복구하고 catch 밑에 있는 문장들을 수행
 * 		ex) 
 *	 		문장 1
 * 			문장 2	
 * 			문장 3
 * 			문장 4 ==> 얘가 Error라면 ==> 문장 4,5 수행 하지 않고 catch를 수행함. 
 * 			문장 5 
 * 	}catch(예외처리클래스)
 * 	{	
 * 		예외를 처리 (복구) => 에러가 출력한 부분을 제외하고 나머지 수행 
 * 	}
 * 	finally
 * 	{
 * 		try나 catch나 상관없이 무조건 수행하는 문장 
 * 			┗ 파일 닫기
 * 			┗ 서버 닫기 
 * 	}
 * 
 * 	2. 목적
 * 	 1) 에러를 찾아서 수정할 목적 (프로그래머의 목적)
 * 		=> 에러메시지 확인  
 * 			┗ getMessage(): 에러메시지만 전송
 * 			  ex) 10/0 ==> / by zero 
 * 			┗ printStackTrace(): 실행한 파일을 읽어서 몇번째 줄이 에러가 났는지를 알려줌.  
 * 	 2) 프로그램이 정상상태를 유지 (유저) : 프로그램이 비정상 종료하지 않도록 해줌..  
 * 
 *  3. 사용법 
 *    - 전체를 처리 => 부분적으로 처리 가능 
 * 		
*/
// 숫자 야구 게임 => 윈도우로 짜보자. 
// 숫자 야구 게임 + 예외처리 (직접처리) 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MainClass2 extends JFrame implements ActionListener {
	JTextArea ta;
	JTextField tf;
	JButton b1,b2;
	
	// 게임에 필요한 데이터 
	int[] com=new int[3];
	int[] user=new int[3];
	int s,b;
	public MainClass2() {
		ta=new JTextArea();
		ta.setEditable(false);
		
		//ta.setEnabled(false);
		//ta.setText("sfsflslfs");
		JScrollPane js=new JScrollPane(ta);
		tf=new JTextField(13); // 13글자 입력 가능할만큼의 width
		tf.setEnabled(false);
		b1=new JButton("시작");
		b2=new JButton("종료");
		
		JPanel p=new JPanel();
		//추가 - add는 쓰는 순서대로 배치된다!
		p.add(tf); p.add(b1); p.add(b2);
		
		//배치 
		add("Center",js);
		add("South", p);
		
		setSize(450, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 윈도우 X창 누르면 프로그램 종료시킴 
		//setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // 윈도우 X창 눌러도 창 못 끄게함 
		
		// 이벤트 추가
		b1.addActionListener(this);
		b2.addActionListener(this);
		tf.addActionListener(this);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass2();
	}
	// 난수를 발생하는 메소드
	public void getRand() {
		int su=0;
		boolean bCheck=false;
		for(int i=0;i<3;i++) 
		{
			// 난수 => 중복이 안 된 경우에만 => com[]에 저장
			bCheck=true;
			while(bCheck)
			{
				//난수 발생
				su=(int)(Math.random()*9)+1; //1~9사이 숫자 랜덤발생
				bCheck=false;
				// 저장된 (com[])값, 난수가 발생된 값 (su) 중복여부 확인
				// 중복된 경우에는 bCheck=true로 만들어서 while문 다시 돌게.
				for(int j=0;j<i;j++) {
					if(com[j]==su) {
						bCheck=true;
						break;
					}
				}
			}
			com[i]=su;
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// 버튼 클릭 시 처리 
		if(e.getSource()==b1) 
		{
			//난수발생
			getRand();
			JOptionPane.showMessageDialog(this, "게임을 시작합니다."); //이 창(this) 위에 메시지를 띄운다.
			tf.setEnabled(true); //tf를 활성화시킴
			b1.setEnabled(false); //시작버튼을 비활성화시킴
			tf.requestFocus(); // tf에 포커스 갖다놓음 
		}
		else if(e.getSource()==b2) 
		{
			dispose(); // 메모리 회수!! 
			System.exit(0); // 프로그램 종료
		}
		else if (e.getSource() == tf) {
			String input = tf.getText();
			input=input.trim(); // 유저가 숫자 입력해도 공백이 들어갔으면 int로 변환 못하므로 trim
			// input.trim(); 만 하면 안 됨ㅋ trim한 값을 input에 대입해야함! 
			if (input.length() < 1) {
				JOptionPane.showMessageDialog(this, "세자리 정수를 입력하세요.");
				// javascript => alert()
				tf.requestFocus();
				return;
			}
			// 유저가 입력한 값을 정수로 바꿔야 (혹시 유저가 잘못 입력했을 수 있으니...)
			int no=0;
			try {
				// 정수 변환 : 유저가 숫자를 입력해도 getText니까 String으로 받아오기 때문. 
				no = Integer.parseInt(input);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(this, "정수만 입력 가능합니다.");
				tf.setText(""); // tf값 비워서 유저가 다시 입력하게 함
				tf.requestFocus(); // 유저님이 다시 입력하시기 쉽도록 포커스 맞춰드림
				return; // 모든 메소드는 return이 걸리는 순간 끝난다. 어디서 멈춰야 할지 잘 생각해줘야!
			}
			// 잘못된 입력
			if(no<100||no>999) 
			{	JOptionPane.showMessageDialog(this, "세자리 정수만 입력 가능합니다.");
				tf.setText(""); // tf값 비워서 유저가 다시 입력하게 함
				tf.requestFocus(); // 유저님이 다시 입력하시기 쉽도록 포커스 맞춰드림
				return; // 모든 메소드는 return이 걸리는 순간 끝난다. 어디서 멈춰야 할지 잘 생각해줘야!
				// 위와 중복된 코드 ==> 메소드로 처리해야...
			}
		
			// user[]에 저장
			user[0]=no/100;
			user[1]=(no%100)/10;
			user[2]=no%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				//user간데 중복된 수 있는지 확인
				JOptionPane.showMessageDialog(this, "중복된 수는 사용할 수 없습니다.");
				tf.setText("");
				tf.requestFocus();
				return;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0 ) 
			{
				JOptionPane.showMessageDialog(this, "0은 사용할 수 없습니다.");
				tf.setText("");
				tf.requestFocus();
				return;
			}
			
			// 비교
			s=0;
			b=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(com[i]==user[j]) {
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			// 힌트
			String hint="Input Number:"+no+", Result:"+s+"S-"+b+"B\n";
			ta.append(hint);
			// 종료여부
			if(s==3) {
				int res=JOptionPane.showConfirmDialog
						(this, 
						"종료할까요?-컨펌창 문구","게임 종료-컨펌창 타이틀바", 
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
						//Yes-no 버튼 두 개만 갖고있음
				if(res==JOptionPane.YES_OPTION) {
					dispose(); 
					System.exit(0);
				}
				else {
					ta.setText("");
					tf.setText("");
					tf.setEnabled(false);
					b1.setEnabled(true);
				}
			}
			
			tf.setText("");
			tf.requestFocus();
		}
	}
	

}




