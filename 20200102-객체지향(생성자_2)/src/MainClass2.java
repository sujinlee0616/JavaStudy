/*
 * 1. 데이터의 초기화
 * 	1) 생성자 : 생성자 호출을 위해 항상 new 써야함 ==> 부를때마다 new 하니까 값을 수정하는건 불가능. 
 * 	2) setter : 값 설정했다가 내가 원할 때 값을 수정할 수 있다. 
*/
class Music{
	//Movie m=new Movie(); //같은 폴더(패키지) 안에 있으므로  Movie가 public이 아니어도 가져올 수 있다.
	private int mno;
	private String title;
	private String singer;
	
	//캡슐화. 데이터는 감췄지만 읽기쓰기 기능을 갖췄음. 
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	//
	public Music(int mno, String title, String singer) {
		super();
		this.mno = mno;
		this.title = title;
		this.singer = singer;
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		Music music = new Music(100, "흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야", "장범준");
		
		// 저장
		/*
		 * music.setMno(100); music.setTitle("흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야");
		 * music.setSinger("장범준");
		 */
		
		// 읽기
		System.out.println(music);
		System.out.println(music.getMno());
		System.out.println(music.getTitle());
		System.out.println(music.getSinger());
		
		// 기존의 music을 수정한 게 아니라 새로운 music이 생긴거임....
		music = new Music(101, "흔들리는 꽃", "조아 아부지"); 
		System.out.println(music); //주소가 달라졌음을 알 수 있다 
		System.out.println(music.getMno());
		System.out.println(music.getTitle());
		System.out.println(music.getSinger());
		
		// 기존의 music의 값을 바꾸었다 : setter 이용
		music.setMno(102); 
		music.setTitle("꽃");
		music.setSinger("조아아빠");
		System.out.println(music); //주소가 같음을 알 수 있다 
		System.out.println(music.getMno());
		System.out.println(music.getTitle());
		System.out.println(music.getSinger());
		
	}

}
