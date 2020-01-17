package com.sist.image;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainForm_ImageThread extends JFrame implements ActionListener {
	JButton startBtn, prevBtn, nextBtn;
	ImageView imagePanel;
	int no=1;
	
	public MainForm_ImageThread() {
		// 메모리할당
		startBtn=new JButton("시작");
		prevBtn=new JButton("이전");
		nextBtn=new JButton("다음");
		imagePanel=new ImageView();
		// 클래스는 new를 이용해서 힙영역에 저장 
		// ※ new를 사용할 수 없는 클래스 : 미완성 클래스 (추상클래스, 인터페이스)

		// 배치 
		JPanel p=new JPanel();
		p.add(startBtn);
		p.add(prevBtn);
		p.add(nextBtn);
		
		// 윈도우 올리기
		add("Center", imagePanel);
		add("South", p);
		
		// 크기 결정 
		setSize(640, 480); // 참고 : setBounds로도 크기 결정 가능. 근데 얘는 크기도 그렇지만 '위치'를 지정. 
		// 그에 반해서 setSize는 x=0, y=0임. 
		// 윈도우를 보여준다. 
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		// system.exit(0);  // 전체 윈도우 종료 : 윈도우 창에서 X버튼 눌렀을 때
		
		// 이벤트 등록
		startBtn.addActionListener(this);
		prevBtn.addActionListener(this);
		nextBtn.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainForm_ImageThread();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==startBtn)
		{
			imagePanel.setImage(0);
			imagePanel.repaint();
			// 그림을 다른걸 불러올 때는 이전 그림을 그리고 새로운 그림을 가져와야 ==> repaint
			new ImageThread().start();
		}
		else if(e.getSource()==prevBtn)
		{
			no--;
			if(no<1)
				no=1;
			imagePanel.setImage(no);
			imagePanel.repaint();
			
			
		}
		else if(e.getSource()==nextBtn)
		{
			no++;
			if(no>5)
				no=5; //5페이지보다 크다면 5페이지까지만 봐라 
			imagePanel.setImage(no);
			imagePanel.repaint();
		}
	}
	
	// 자동으로 출력하고싶음... 
	
	  class ImageThread extends Thread // 쓰레드를 이용할 때 이너클래스 사용
	  {
	  	public void run()
	  	{
	  		while(true)
	  		{
	  			try
	  			{
	  				no++;
	  				if(no>5)
	  					no=1;
	  				imagePanel.setImage(no);
	  				imagePanel.repaint();
	  				Thread.sleep(1000);
	  			}catch(Exception ex) {}
	  		}
	  	}
		  
	  }
	 

}
