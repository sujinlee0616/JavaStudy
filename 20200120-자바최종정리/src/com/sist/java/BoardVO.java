package com.sist.java;
// 캡슐화 
public class BoardVO {

	private int no;
	private String name;
	private String subject;
	// 외부와 접속이 가능하게 
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
