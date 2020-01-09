/*
 * <Java에서 자동으로 해주는 것>
 * 1) extends Object 안 써도 자동으로 넣어져있음
 * 2) 생성자 없는 경우 => 디폴트 생성자를 자동으로 채워줌
 * 3) 메소드에 void 일때 => return이 없는 경우 return을 자동으로 채워줌
 * 4) import java.lang 타이핑 따로 안 해도 자동으로 넣어놓음
 * 5) interface : 인터페이스는 public 안 붙여도 디폴트가 퍼블릭.  
 * 		void disp(); ==> public abstract void display();
 * 		int a=10;    ==> public static final int a=1-;
*/
/*
 * JLabel : 불투명
 * JPanel : 투명
 * ==> setOpaque 이용해서 투명도 조절하면 됨
 * 
 * 글자를 투명하게 만들고 싶다면 알파값 이용하면됨
 * setBackground(new Color(0,0,0,1)) 맨 뒤에 있는, 4번째 값이 알파값. 
*/
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainClass3 extends JFrame implements ItemListener{ //콤보박스는 ActionListener가 아니라 ItemListener!
	JLabel la1,la2;
	JComboBox box = new JComboBox();
	
	public MainClass3() {
		la1=new JLabel("선택");
		box.addItem("홍길동");
		box.addItem("심청이");
		box.addItem("박문수");
		la2=new JLabel("");
		la2.setFont(new Font("굴림체", Font.BOLD, 35));
		
		JPanel p=new JPanel();
		p.add(la1);
		p.add(box);
		
		add("North", p);
		add("Center", la2);
		setSize(450, 350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		box.addItemListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass3();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box) 
		{
			String name=box.getSelectedItem().toString(); 
			// Object는 String으로 변환 가능하다!!
			// toString : Object를 함수형으로 만듦
			la2.setText(name);
		}
	}

}



