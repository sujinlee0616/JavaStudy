import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;

public class MyTable extends JFrame implements ActionListener,MouseListener{
	JTable table; // 테두리 관리하는 애. (테이블 모양)
	DefaultTableModel model; // 데이터 관리하는 애 
	JLabel la1,la2,la3;
	JTextField tf1,tf2,tf3;
	JButton b;
	TableColumn column;
	
	public MyTable() {
		la1=new JLabel("이름");
		la2=new JLabel("주소");
		la3=new JLabel("전화");
		
		tf1=new JTextField(7);
		tf2=new JTextField(7);
		tf3=new JTextField(7);
		b=new JButton("등록");
		
		JPanel p=new JPanel();
		p.add(la1); p.add(tf1);
		p.add(la2); p.add(tf2);
		p.add(la3); p.add(tf3);
		p.add(b);
		
		// 테이블 제작
		String[] col= {"이름","주소","전화"};
		String[][] row=new String[0][3]; // 한 줄에 세개씩. 가변형 데이터
		model=new DefaultTableModel(row,col) {
			// 익명의 클래스
			// 부르는 법 : 블록{} 안에서 우클릭 > Source > Override/Implement Methods > isCellEditable 선택
			// 디폴트 설정에서는 더블클릭했을 때 테이블 셀 안의 값들이 수정가능한데, 이것을 막았음.  
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false; 
			}
		};
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		// 테이블 추가적인 옵션들 설정
		table.getTableHeader().setReorderingAllowed(false); //테이블 헤더를 드래그해서 순서를 바꾸지 못하도록 막음.
		table.setRowHeight(38); 
		table.setShowHorizontalLines(false); 
		table.setShowVerticalLines(false);
		table.getTableHeader().setBackground(Color.pink);
		js.getViewport().setBackground(Color.white);
		
		add("Center",js);
		
		add("North",p);
		setSize(600,480);
		setVisible(true); // 윈도우 보여주는 것
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		// 이벤트 등록 - 클릭 관련 함수 호출 
		b.addActionListener(this);
		// 이벤트 등록 - 마우스 관련 함수 호출
		table.addMouseListener(this);
		
		// 테이블 셀 width 설정 
		for(int i=0;i<3;i++) {
			column=table.getColumnModel().getColumn(i);
			TableCellRenderer rend=column.getCellRenderer();
			if(i==0) {
				column.setPreferredWidth(150);
			}
			else if(i==1) {
				column.setPreferredWidth(450);
			}
			else if(i==2) {
				column.setPreferredWidth(250);
			}
			column.setCellRenderer(rend);
			
		}
	} 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyTable();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b) {
			//이름,주소,전화번호값을 받아옴
			String name=tf1.getText();
			if(name.length()<1) { //이름값에 입력된 게 없을 때
				JOptionPane.showMessageDialog(this, "이름을 입력하세요");
				return; // actionPerformed가 종료됨 ==> 이 아래로는 실행하지 않음.  
			}
			String addr=tf2.getText();
			String tel=tf3.getText();
			
			//받아온 이름,주소,전화번호값을 테이블에 추가 
			String[] data= {name,addr,tel};
			model.addRow(data);
			
			//입력한 값 지워줌 
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			
		}
	}


	@Override
	public void mouseClicked(MouseEvent e) { // 클릭했을 때
		// TODO Auto-generated method stub
		if(e.getSource()==table) {
			if(e.getClickCount()==2) { //더블클릭했을 때 
				int row=table.getSelectedRow();
				String name=model.getValueAt(row, 0).toString();
				String addr=model.getValueAt(row, 0).toString();
				String tel=model.getValueAt(row, 0).toString();
				
				String data="이름:"+name+"\n"
						+"주소"+addr+"\n"
						+"전화"+tel;
				
				JOptionPane.showMessageDialog(this, data);
			}
		}
	}


	@Override
	public void mousePressed(MouseEvent e) { // 마우스 꾹 눌렀을 때 (ex. 드래그하는 중)
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) { //
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) { // hover했을 때 
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) { //hover했다가 벗어났을 때 
		// TODO Auto-generated method stub
		
	}

}
