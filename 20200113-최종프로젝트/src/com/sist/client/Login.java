package com.sist.client;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * <Java GUI>
 * 	1. JFrame
 * 	2. JPanel 
 * 		ex) 이클립스의 tab.  
 * 	3. JWindow 
 * 		: 타이틀 바 (X) 열고닫는 바 (X) ex) 이클립스 띄울 때 나오는 창. 
 * 	4. JDialog 
 * 		: 닫기버튼(O) 최대화/최소화 버튼(X)
 * 		1) Modal : 이 창이 종료되기 전까지 다른 작업 불가. 
 * 			ex) 이클립스에서 Java Project 새로 만들 때 뜨는 창 
 * 			ex) 게임에서 '방만들기' 창. 
 * 		2) Modeless : 창이 떠있지만 다른 작업 가능.  
 * 			ex) 이클립스 Ctrl+F 하면 나오는 Find/Replace 창
 * 
 *  extends : 상속 
*/
import java.awt.*; // window와 관련된 클래스
public class Login extends JPanel {
	
	// 클래스 영역 안에서는 제어문 쓸 수 X!! 클래스 영역 안에서는 선언만 할 뿐! ★
	// (제어문 쓰고 싶으면 메소드를 만들고 그 안의 메소드 영역에다가 해야....) 
	// 그래서 클래스 영역에서 이미지 가져오려고 아래와 같이 이미지 선언 후 초기화 블록을 만들었다. 
	Image back;
	JLabel la1,la2; // Ctrl+space하면 import 된다. 
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	
	//생성자 함수. 생성자 함수에서 화면을 만들어줘야 한다. 
	Login()	{ // 앞에다가 리턴타입 붙이면 메소드가 되어버림. 안 된다. 	
		setLayout(null);
		back=Toolkit.getDefaultToolkit().getImage("c:\\image\\background.jpg");
		//초기화 블록 : 이미지를 갖고 오고 싶어요. 초기화 하고 싶어요.
		la1=new JLabel("ID",JLabel.RIGHT);
		la1.setForeground(Color.blue);
		la2=new JLabel("Password",JLabel.RIGHT);
		la2.setForeground(Color.blue);
		
		tf=new JTextField();
		pf=new JPasswordField();
		
		b1=new JButton("로그인");
		b2=new JButton("취소");
		
		// 배치
		la1.setBounds(390,330,80,30);
		tf.setBounds(475,330,150,30);
		
		la2.setBounds(390,365,80,30);
		pf.setBounds(475,365,150,30);
		
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(390,405,235,35);
		p.setOpaque(false);

		add(la1);
		add(tf);
		
		add(la2);
		add(pf);
		
		add(p);
		
	}
	

	@Override
	protected void paintComponent(Graphics g) { // <== 그림 그리는 메소드   // 스킨은 PainComponent로 만든다. 
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this); //this : 얘 자신. 
	}

}





