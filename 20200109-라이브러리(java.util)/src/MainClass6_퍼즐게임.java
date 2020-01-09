import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainClass6_퍼즐게임 extends JFrame implements ActionListener{
	JButton b1,b2;
	JButton[][] bu=new JButton[3][3]; //bu는 버튼 
	int[][] panCount=new int[3][3]; 
	int brow,bcol;
	public MainClass6_퍼즐게임()
	{
		b1=new JButton("Start");
		b2=new JButton("Exit");
		int k=1;
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(3,3,5,5));
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				bu[i][j]=new JButton(String.valueOf(k)); //k를 String으로 변환시켜서 줘야함!
				bu[i][j].setFont(new Font("굴림체",Font.BOLD,20));
				p1.add(bu[i][j]);
				bu[i][j].addActionListener(this);
				k++;				
			}
		}
		
		JPanel p2=new JPanel();
		p2.add(b1); p2.add(b2);
		
		add("Center",p1);
		add("South",p2);
		
		setSize(350, 370);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		getRand();
		display();
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void getRand() 
	{
		int[] com=new int[9];
		int su=0;
		boolean bCheck=false;
		for(int i=0;i<9;i++) {
			bCheck=true;
			while(bCheck) 
			{
				su=(int)(Math.random()*9); //0~8까지 발생
				//난수 중복되지 않게 발생하도록 만들기
				bCheck=false;
				for(int j=0;j<i;j++) 
				{
					if(com[j]==su) {
						bCheck=true;
						break;
					}
				}
			}
			com[i]=su;
			panCount[i/3][i%3]=su;
			if(su==8) {
				brow=i/3; 
				bcol=i%3;
			}
		}
	}
	
	public void display() 
	{
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==brow && j==bcol) 
				{
					bu[i][j].setText("");
					bu[i][j].setEnabled(false);
				}
				else 
				{
					bu[i][j].setText(String.valueOf(panCount[i][j]+1));
					//panCount값은 0~8인데 실제로 눈에 보이는 UI에는 1~9 보이게 해놨음.  
					bu[i][j].setEnabled(true);
				}
			}
		}
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass6_퍼즐게임();
	}
	
	public boolean isEnd() 
	{
		int k=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(panCount[i][j]!=k) {
					return false;
				}
				else{
					k++; //(3,3)이 8번째가 될 때 ...
				}
			}
		}
		return true; //for문 끝나면 isEnd를 true로 돌린다. ==> 게임 끝 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			getRand();
			display();
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(e.getSource()==bu[i][j]) //i번째 j번째 버튼을클릭했을 때  
				{
					if(!(i==brow && Math.abs(bcol-j)==1 || j==bcol && Math.abs(brow-i)==1))
						return;
						//빈칸 바로 옆 퍼즐이 아니면 움직이지 못하게해라
						//빈칸 바로 옆이다 : 1) 같은 줄에 있고 열번호 차이가 1 OR 2) 같은 열에 있고 행번호 차이가 1 
					panCount[brow][bcol]=panCount[i][j]; //빈공간을 클릭한 그림의 번호로 변경. 
					panCount[i][j]=8;
					brow=i; 
					bcol=j; //
					display();
					if(isEnd()) {
						JOptionPane.showMessageDialog(this, "Game Over");
						
					}
					
				}
			}
		}
	}

}
