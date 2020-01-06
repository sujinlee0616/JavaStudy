package com.sist.client;
/*
 * <배치>
 *  1. BorderLayout : JFrame, JDialog, JWindow
 *  	- JWindow ex) 이클립스 시작할 때 달 이미지 나오는거
 *  	- JDialog ex) 이클립스 시작할 때 달 이미지 후에 나오는 workspace 선택하는 창. 최대화 버튼이 없다.
 *  	- JFrame ex) 이클립스 프로그램.  
 *   	- 5군데 배치 가능 : East, West, Center, North, South ==> 매번 5군데 다 배치할 필요X. 한 군데에만 배치해도 됨.
 *  2. FlowLayout
 *  3. GridLayout
 *  4. 사용자 정의  
 *  
 * <컨테이너 vs 컴포넌트> 
 * - JButton과 같이 혼자서 동작 불가능하고 낱개로 가는 것들을 '컴포넌트'라고 한다. 
 * - 이와 반대의 것을 '컨테이너'라고 한다. 
*/
import java.awt.*; // 윈도우에 관련된 것을 가지고 옴 - Layout, Event 등이 들어있다.
import javax.swing.*; 
public class LayoutEx {
	JFrame frame = new JFrame("BorderLayout");  
	// 타이틀 바에 'Border Layout'이라고 나온다. 
	// 디폴트 접근지정어 ==> JFrame은 같은 패키지 내에서는 사용 가능.

	public LayoutEx() 
	{
		JButton[] btn = new JButton[5];
		String[] layout = {"East", "West", "Center", "North", "South"};
		/*
		 * for(int i=0; i<5;i++) { btn[i]=new JButton(layout[i]); frame.add(layout[i],
		 * btn[i]); }
		 */
		/*
		 * btn[0]=new JButton("버튼문구 : Center"); frame.add("Center",btn[0]); btn[1]=new
		 * JButton("버튼문구 : Center"); frame.add("South",btn[1]);
		 */
		btn[0] = new JButton("버튼문구 : West");
		frame.add("West", btn[0]);
		btn[1] = new JButton("버튼문구 : East");
		frame.add("East", btn[1]);
		
		frame.setSize(350, 350);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LayoutEx ex = new LayoutEx();
		
	}

}





