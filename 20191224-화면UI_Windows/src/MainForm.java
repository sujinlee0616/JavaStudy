import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
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
		if(e.getSource()==login.b1) {
			card.show(getContentPane(), "WR");
		}
		else if(e.getSource()==login.b2) {
			
		}
	}

	
}
