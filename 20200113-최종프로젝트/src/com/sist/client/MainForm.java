package com.sist.client;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.smartcardio.Card;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

//패키지가 틀리기 때문에 임포트했음 
import com.sist.dao.MemberDAO;
public class MainForm extends JFrame implements ActionListener { // <== extends Activity로 바꾸면 안드로이드임! 세상에 
	Login login=new Login();
	WaitRoom wr=new WaitRoom();
	CardLayout card=new CardLayout(); // 윈도우 창은 그대로 냅두고 tab 변경하기 위해서. 
	MainForm(){
		//위에 있을수록 창이 먼저 뜬다 ==> 로그인창>WR(WatingRoom)창 
		setLayout(card);
		add("LOGIN",login);
		add("WR",wr);
		//add("Center",login);
		
		setSize(1024,768);
		setVisible(true); // 윈도우 보여라
		login.b1.addActionListener(this);
	}
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
			JFrame.setDefaultLookAndFeelDecorated(true);
		}
		catch(Exception e) {}
		MainForm mf=new MainForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// 로그인버튼 누르면 창 전환 
		// 비밀번호는 
		if(e.getSource()==login.b1) {
			String id=login.tf.getText();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this,"ID를 입력하세요");
				login.tf.requestFocus();
				return;
			}
			String pwd=String.copyValueOf(login.pf.getPassword()); 
			// 비밀번호는 반드시 , getTExt가아니라 getPassword로 갖고 와야!!
			if(pwd.length()<1)
			{
				JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");
				login.pf.requestFocus(); //강제로 포커스 줌 
				return;
			}
			
			// 처리 
			MemberDAO dao=new MemberDAO();
			String result=dao.isLogin(id,pwd);
			if(result.equals("NOID")) 
			{
				JOptionPane.showMessageDialog(this, "ID가 존재하지 않습니다.");
				login.tf.setText("");
				login.pf.setText("");
				login.tf.requestFocus();
			}
			else if(result.equals("NOPWD")) 
			{
				login.pf.setText("");
				login.pf.requestFocus();
				JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다");
			}
			else 
			{
				JOptionPane.showMessageDialog(this, id+"님 로그인되었습니다.");
				card.show(getContentPane(),"WR");
			}
		}

	}

	
}
