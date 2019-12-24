
public class 메소드4 {
	static String[] movieList(int page) {
		String[] data=new String[5];
		String[] title= {
				"백두산",
				"시동",
				"포드 V 페라리",
				"겨울왕국 2",
				"나이브스 아웃",
				"쥬만지: 넥스트 레벨",
				"블랙머니",
				"캣츠",
				"신비아파트 극장판 하늘도깨비 대 요르문간드",
				"6 언더그라운드",
				"감쪽같은 그녀"
		};
		
		int rowSize=5; //한 페이지에 5개씩 나오게 하겠다 
		int j=0; //5개씩 나눠주는 변수 
		int pagecnt=(page*rowSize)-rowSize; //시작점
		// page : 페이지 넘버. ex) 1page, 2page, ...
		// pagecnt : 페이지의 시작점.  
		// 1page => 영화 0~4번 ==> pagecnt=0
		// 2page => 영화 5~9번 ==> pagecnt=5
		// 3page => 영화 10~14번 ==> pagecnt=10 
		
		int k=0;
		//i는 영화의 번호 0,1,2,3,4,5,6,7,....
		for(int i=0;i<title.length;i++) {
			if(j<5 && i>=pagecnt) { //j는 5개가 되면 종료하고 빠져나감  //i가 페이지시작점보다 크면 데이터 넣어라. 
				data[k]=title[i];
				k++;
				j++;
			}
		}
		return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int page=1;
		String[] data=movieList(page);
		for(String s:data) {
			System.out.println(s);
		}

	}

}





