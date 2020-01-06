public class Member {
	private String id;
	private String pwd;
	
	public Member() {
		id="hong";
		pwd="1234";
	}
	
	public Member(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}

	public void print() 
	{
		System.out.println("ID:"+id);
		System.out.println("Password:"+pwd);
	}
}
