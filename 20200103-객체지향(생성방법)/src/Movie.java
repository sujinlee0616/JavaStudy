import java.awt.*;
import javax.swing.*;

public class Movie {
	JPanel p; 
	JLabel la;
	JTextField f;
	private String poster;
	private String name;
	
	public Movie() {
		poster="c:\\image\\poster.jpeg";
		name="õ��: �ϴÿ� ���´� (2018)";
		la = new JLabel(new ImageIcon(poster)); 
		f = new JTextField();
		f.setText(name);
		p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add("Center", la);
		p.add("South", f);
		
	}
}
