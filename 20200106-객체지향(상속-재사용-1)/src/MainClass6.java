import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.awt.event.*;
public class MainClass6 extends JFrame implements ActionListener,MouseListener{
	// JFrame-클래스 , ActionListener-인터페이스 ==> 인터페이스와 상속 동시에 할 수 있다. 
	// 인터페이스는 다중 가능  
	JButton b = new JButton("Click");
	public MainClass6() {
		// 배치
		add("North", b); // JFrame이 가지고 있는 메소드들을 사용하게 하는 것...
		setSize(480,  300);
		setVisible(true);
		//b.addActionListener(this);
		b.addMouseListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass6();
	}

	@Override
	public void actionPerformed(ActionEvent e) { // 버튼 눌렀을 때 처리해주는 함수 
		// TODO Auto-generated method stub
		if(e.getSource()==b) //클릭한 버튼이 b라면 
		{  
			System.out.println("B버튼 클릭!!");
		}
	}
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
