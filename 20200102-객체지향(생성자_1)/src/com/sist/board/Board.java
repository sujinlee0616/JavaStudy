package com.sist.board; 
//패키지 : 그냥 '폴더'라고 생각해라.
//패키지 명은 보통 'com' 또는 'org'로 시작한다. ex) com.회사명.분류 

public class Board {
	int no;
	String name;
	String regdate; //default ==> 같은 폴더에서만 접근 가능. 
	
	//생성자 : 멤버변수 초기화 
	public Board(int no, String name, String regdate)
	{
		this.no=no; //이 클래스의 멤버변수에다가 지역변수 값을 넣음 
		this.name=name;
		this.regdate=regdate;
	}
	
	public void boardList() 
	{
		System.out.println("번호:"+no);
		System.out.println("이름:"+name);
		System.out.println("등록일"+regdate);
	}

}
