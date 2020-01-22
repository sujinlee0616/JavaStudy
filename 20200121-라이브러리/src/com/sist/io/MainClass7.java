// [객체 단위 저장] c:\\oracle\\member.txt 에 ArrayList 저장하기
package com.sist.io;
import java.io.*;
import java.util.*;
class Member implements Serializable { //Serializable 을 주지 않으면 저장은 되지만 가지고 올 수 없다. 
	// 반드시 저장하는 데이터는 Serializable 줘야함 
	// 이 파일에서 저장할 땐 직렬로, 읽어올 땐 병렬로(객체니까) 읽게됨.  
	private String id;
	private String name;
	private String sex;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ArrayList<Member> list = new ArrayList<Member>();
			Member m1=new Member(); 
			m1.setId("hong");
			m1.setName("홍길동");
			m1.setSex("남자");
			list.add(m1);
			
			m1=new Member();
			m1.setId("shim");
			m1.setName("심청이");
			m1.setSex("여자");
			list.add(m1);
			
			m1=new Member();
			m1.setId("lee");
			m1.setName("이순신");
			m1.setSex("남자");
			list.add(m1);
			// ====> ArrayList 안에 3개의 데이터가 저장되었다. 
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:\\oracle\\member.txt"));
			oos.writeObject(list);
			oos.close();
			
			System.out.println("ArrayList 저장 완료");
			
		}catch(Exception ex) {}
	}

}








