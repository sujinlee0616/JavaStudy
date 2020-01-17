package com.sist.image;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 이렇게 만들면 제대로 작동X...  ==> 2-1처럼 쓰레드 사용해야 우리가 원하는대로 만들 수 있다. 
// 프로그레스바가 종료한 후에 보여주기 때문. 

public class MainForm2_ProgressBar_ThreadX extends JFrame implements ActionListener {
	JButton b;
	JProgressBar bar;
	
	// 생성자 
	public MainForm2_ProgressBar_ThreadX()
	{
		b=new JButton("Start");
		bar=new JProgressBar();
		bar.setMinimum(0);
		bar.setMaximum(100);
		bar.setForeground(Color.cyan); // 전경색 지정
		bar.setBackground(Color.white); // 배경색 지정
		bar.setStringPainted(true); // 표시나게...
	
		add("Center", bar);
		add("South", b);
		
		setSize(450, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b.addActionListener(this);
	}

	// 프로그래스바 진행되게 하는 함수 
	public void go()
	{
		try
		{
			for(int i=0;i<=100;i++)
			{
				bar.setValue(i);
				Thread.sleep(100);
			}
		}catch(Exception ex) {}
	}
	
	// 메인 함수 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainForm2_ProgressBar_ThreadX();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==b) // 버튼 누르면 go함수 호출해라 
		{
			go();
		}
	}

}
