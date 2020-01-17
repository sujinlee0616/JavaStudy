package com.sist.image;
import java.awt.*;
import javax.swing.*;

public class ImageView extends JPanel{
	Image back;
	// back => 메모리 할당 (초기화)
	
	public ImageView()
	{
		back=Toolkit.getDefaultToolkit().getImage("C:\\image\\background2.jpeg");
	}
	public void setImage (int no)
	{
		if(no==0) {
			back=Toolkit.getDefaultToolkit().getImage("C:\\image\\0.jpeg");
		}
		else {
			back=Toolkit.getDefaultToolkit().getImage("C:\\image\\movie"+no+".jpg");
		}
		
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(back, 0, 0, getWidth(),getHeight(), this); // 그림을 화면 크기에 딱 맞게 그려라 
		
	}
	

}
