package com.sist.client;
import java.awt.*;
import javax.swing.*;
/*
 * [기타]
 * 	java : JDK ver1.2 이전에 만들어진 애는 다 'java'로 시작됨
 * 	javax : JDK ver1.2 이후부터 만들어진 애는 'javax'로 시작됨 (x : extends) 
 *  JDK ver1.8부터 획기적으로 바뀌었다. 오라클이 만들기 시작하면서 그럼. 형식이 C로 바뀌었음.
 *  
 * [기타]
 *  HTML ==> XML (X: extends ==> 사용자가 정의해서 써라! ㅇㅅㅇ)
*/
public class LayoutEx2 {
	JFrame frame = new JFrame();
	public LayoutEx2() {
		//frame.setLayout(new FlowLayout());
		frame.setLayout(new GridLayout(3,2,10,50)); // GridLayout(가로줄,세로칸,버튼사이 가로간격,버튼사이 세로간격)
		JButton b1=new JButton("국어");
		JButton b2=new JButton("영어");
		JButton b3=new JButton("수학");
		JButton b4=new JButton("국어");
		JButton b5=new JButton("영어");
		JButton b6=new JButton("수학");
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		
		frame.setSize(400,300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LayoutEx2();
	}

}
