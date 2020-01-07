import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
 * interface ==> implements 인터페이스명 
 * =========
 * 	다중 상속이 가능
 * 
 * 	interface A
 * 	interface B
 * 	class C implements A,B,... //다중상속 	
*/

public class MyTextField extends JFrame implements ActionListener{
	JTextField tf=new JTextField();
	JTextArea ta=new JTextArea();
	
	public MyTextField() {
		
		ta.setEditable(true);
		JScrollPane js = new JScrollPane(ta); //ScrollPane : 가로/세로 스크롤바 두 개, 안에  Textfield가지고 있음. 
		add("Center", js); //JFrame은 기본이 BorderLayout이니까
		add("South", tf);
		setSize(350,450);
		setVisible(true);
		
		// 이벤트 등록
		tf.addActionListener(this); // 1. 엔터 시에 이벤트 발생
		// actionPerformed가 MyTextField 안에 있기 떄문에 (this)라고 했음 
		// 만약에 actionPerformed가 MyTextField 클래스 밖에 있었다면 (ex. 다른 클래스) 그 클래스명을 적어야..???
		
		// 윈도우창 종료 시 프로그램 종료되도록. 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자 
		new MyTextField();
	}

	@Override
	public void actionPerformed(ActionEvent e) { // actionperfo
		// TODO Auto-generated method stub
		if(e.getSource()==tf) // 2. 엔터를 친 textField가 뭐냐? 
		{
			ta.append(tf.getText()+"\n"); 
			// append: 문자열 결합: 기존에 있던 문자열에 문자를 붙여라.
			// ta.setText(tf.getText()+"\n"); 
			// setText: 새로운 문자만 출력: 기존에 있던 문자열을 지우고 새로운 문자열을 넣어라.
			// tf.getText() : 입력된 문자를 읽어온다. 
		}
		
	}

}
