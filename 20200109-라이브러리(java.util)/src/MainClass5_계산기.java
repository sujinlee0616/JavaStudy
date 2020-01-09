import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainClass5_계산기 extends JFrame implements MouseListener{
	// Action은 버튼에다가!
	// Mouse는 버튼 아닐 때 ! ==> '='이 'JLabel'이므로 ActionListener가 아니라 MouseListener 

	JTextField tf1,tf2; // HTML에서는 <input type=text>
	JLabel la; // HTML에서는 <label>
	JComboBox box; // HTML에서는 <select>
	JTextField tf3;
	
	public MainClass5_계산기() 
	{
		tf1=new JTextField(9);
		tf2=new JTextField(9);
		la=new JLabel("=");
		box=new JComboBox();
		box.addItem("+");
		box.addItem("*");
		box.addItem("-");
		box.addItem("/");
		tf3=new JTextField(9);
		
		setLayout(new FlowLayout()); //디폴트인 BorderLayout을 벗어나기 위해...
		
		add(tf1);add(box);add(tf2);add(la);add(tf3);
		setSize(450, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		la.addMouseListener(this); //this : 이 안에 얘를 처리하는 메소드가 존재한다
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass5_계산기();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==la) 
		{
			String num1=tf1.getText();
			String num2=tf2.getText();
						
			String op=box.getSelectedItem().toString();
			
			// num1,num2 지금 String이니까 숫자로 바꿔줘야
			int n1=Integer.parseInt(num1);
			int n2=Integer.parseInt(num2);
			int n3=0;
			
			switch(op) {
			case "+":
				n3=n1+n2;
				break;
			case "-":
				n3=n1-n2;
				break;
			case "*":
				n3=n1*n2;
				break;
			case "/":
				n3=n1/n2;
				break;
			}
			
			// tf3.setText(n3); //Error. n3이 위에서 int이기 때문에... 불가.
			tf3.setText(String.valueOf(n3));
			
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
