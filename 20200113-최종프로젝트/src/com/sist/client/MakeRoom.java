// 방 정보를 만드는 프로그램
package com.sist.client;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MakeRoom extends JDialog implements ActionListener{
    JLabel la1,la2,la3,la4;
    JTextField tf;
    JComboBox box;
    JPasswordField pf;
    JRadioButton rb1,rb2;
    JButton b1,b2;
    public MakeRoom()
    {
    	la1=new JLabel("방이름",JLabel.RIGHT);
    	la2=new JLabel("상태",JLabel.RIGHT);
    	la3=new JLabel("인원",JLabel.RIGHT);
    	la4=new JLabel("비밀번호");
    	
    	tf=new JTextField();
    	pf=new JPasswordField();
    	rb1=new JRadioButton("공개");
    	rb2=new JRadioButton("비공개");
    	ButtonGroup bg=new ButtonGroup(); // 버튼그룹으로 묶어놔야 이 중 택1만 가능하도록 할 수 있음.  
    	bg.add(rb1);
    	bg.add(rb2);
    	// 선택
    	rb1.setSelected(true);
    	
    	la4.setVisible(false);
    	pf.setVisible(false);
    	
    	b1=new JButton("방만들기"); 
    	b2=new JButton("취소");
    	
    	box=new JComboBox();
    	for(int i=2;i<=6;i++)
    	{
    		box.addItem(i+"명"); // 방 만들때 정원이 2명 이상이게 만들어야 하니까 i=2;
    	}
    	
    	// 배치 
    	setLayout(null);
    	la1.setBounds(10,15,50,30);
    	tf.setBounds(65, 15, 150, 30);
    	
    	la2.setBounds(10, 50, 50, 30);
    	rb1.setBounds(65, 50, 70, 30);
    	rb2.setBounds(140, 50, 70, 30);
    	
    	la4.setBounds(60, 85, 55, 30);
    	pf.setBounds(120, 85, 95, 30);
    	
    	la3.setBounds(10, 120, 50, 30);
    	box.setBounds(65, 120, 150, 30);
    	
    	JPanel p=new JPanel();
    	p.add(b1);
    	p.add(b2);
    	
    	p.setBounds(10, 160,205 , 35);
    	add(p);
    	
    	add(la1);add(tf);
    	add(la2);add(rb1);add(rb2);
    	add(la4);add(pf);
    	add(la3);add(box);
    	setSize(255, 255);
    	//setVisible(true);
    	// setVisible의 디폴트값은 false. 
    	// '방만들기' 버튼 클릭했을 때만 노출되도록 처음엔 false상태로 냅둔다.   
    	
    	rb1.addActionListener(this);
    	rb2.addActionListener(this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MakeRoom();
	}
	
	// MakeRoom 자체 내에서만 발생하는 이벤트만 여기다가 적자 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==rb1)
		{
			la4.setVisible(false);
			pf.setVisible(false);
			pf.setText("");
		}
		else if(e.getSource()==rb2)
		{
			la4.setVisible(true);
			pf.setVisible(true);
			pf.setText("");
			pf.requestFocus();
		}
	}

}

