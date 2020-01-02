package com.sist.main;
import com.sist.board.Board;
/* 
 * 	public protected default private
 * 	==================================  
 * 	public : 모든 클래스에서 접근 가능 
 * 	protected, default : 같은 폴더(패키지)에서만 접근 가능. 
 * 						  단, protected는 상속 받은 경우 다른 패키지도 접근 가능.  
 * 	private : 자신의 클래스에서만 접근 가능. 본인만 쓸 수 있다.  
*/
public class MainClass {
	// 모든 클래스는 조립을 위해 public으로 만들어라. 
	// 단, 데이터는 private으로 만들어라. (접근 못 하게) 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MainClass에서 조립함!!
		
		Board b= new Board(1,"게시판","2020-01-02"); 
		// 다른 폴더라면, com.sist.board 폴더에서 생성자 Board에 'public' 안 붙어 있으면 접근이 안되므로 호출 불가능하다. 
		// ==> 생성자 만들 때 반드시 'public' 붙여라. 
		// 같은 폴더라면 'public' 안 붙어 있어도 생성자 호출 가능하다. 
		
		
	}

}
