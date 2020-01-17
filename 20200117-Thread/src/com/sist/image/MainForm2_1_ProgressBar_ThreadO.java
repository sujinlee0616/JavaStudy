package com.sist.image;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// 따로 동작할 때 이렇게 처리해줘야....

public class MainForm2_1_ProgressBar_ThreadO extends JFrame implements ActionListener,Runnable {
	JButton b;
	JProgressBar bar;
	
	// 생성자 
	public MainForm2_1_ProgressBar_ThreadO()
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
		new MainForm2_1_ProgressBar_ThreadO();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==b) // 버튼 누르면 go함수 호출해라 
		{
			new Thread(this).start();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		go();
	}

}
