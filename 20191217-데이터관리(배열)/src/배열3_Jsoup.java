import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/*
 * 	<div class="wrap_movie">
		<div class="info_tit">
			<em class="ico_movie ico_allrating">전체관람가</em>
			<a href="/moviedb/main?movieId=117866" class="name_movie #title">감쪽같은 그녀</a>
		</div>
	</div>
*/
public class 배열3_Jsoup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 배열
		Movie[] m=new Movie[16];
		Document doc=Jsoup.connect("https://movie.daum.net/premovie/released").get();
		//가져올 url1 선택
		Elements link=doc.select("div.info_tit a.name_movie");
		
		int k=1;
		
		for(int i=0; i<link.size();i++) {
			try {
				//url1 출력
				//System.out.println(link.get(i).attr("href"));
				//url1 변형해서 url2 만듦
				String link_data="https://movie.daum.net"+link.get(i).attr("href");
				//url2 출력
				//System.out.println(link_data);
			 	
				//각 상세페이지에서 정보 가져오기 
				//상세페이지 url 넣어줌 
				Document doc2=Jsoup.connect(link_data).get();
				//각 상세페이지에서 가져올 아이들 지정 
				Element title_kr=doc2.selectFirst("div.subject_movie strong.tit_movie");
				Element title_en=doc2.selectFirst("div.subject_movie span.txt_origin");
				Element score=doc2.selectFirst("a.raking_grade em.emph_grade");
				Element genre=doc2.select("dl.list_movie dd.txt_main").get(0);
				Element regdate=doc2.select("dl.list_movie dd.txt_main").get(1);
				Element grade=doc2.select("dl.list_movie dd").get(3);
				Element director=doc2.select("dl.list_movie dd").get(4);
				Element actor=doc2.select("dl.list_movie dd").get(5);
				/*
				 * //몇 개 가져왔는지 출력 System.out.println("count:"+(k)); //상세페이지에서 가져온 아이들 출력
				 * System.out.println(title_kr.text()); System.out.println(title_en.text());
				 * System.out.println(score.text()); System.out.println(genre.text());
				 * System.out.println(regdate.text()); System.out.println(grade.text());
				 * System.out.println(director.text()); System.out.println(actor.text());
				 * System.out.println("=============================");
				 */
				//클래스 저장
				m[i]=new Movie();
				m[i].title_kr=title_kr.text();
				m[i].title_en=title_en.text();
				m[i].score=Double.parseDouble(score.text());
				m[i].grade=grade.text();
				m[i].genre=genre.text();
				m[i].regdate=regdate.text();
				m[i].director=director.text();
				m[i].actor=actor.text();
				//몇 개 가져왔는지 계산
				k++;
			}catch(Exception ex) {k--;}
			//원래 한 페이지에 20개인데, 4개는 뭐가 없어서(ex. 애니메이션이라 주연이 없음) 가져올 수 없음 --> 총 16개만 가져올 수 있더라. 
			//try catch 써서 없는 뭐가 애들은 가져오지 않았음. 	
		}
		/*
		 * Scanner scan=new Scanner(System.in); System.out.println("영화번호 선택(0~15):");
		 * int index=scan.nextInt(); System.out.println("========= 결과 =========");
		 * System.out.println("영화명:"+m[index].title_kr);
		 * System.out.println("감독:"+m[index].director);
		 * System.out.println("출연:"+m[index].actor);
		 * System.out.println("개봉일:"+m[index].regdate);
		 * System.out.println("장르:"+m[index].genre);
		 */
		
		//ex1. 평점이 가장 높은 영화를 출력하라.
		
		double max=0.0;
		for(int i=0;i<m.length;i++) {
			if(m[i]!=null) { //위에꺼 실행하면 16개가 아니라 더 적게 14개?13개?로 나옴. 왜인지 모르나 안 들어간 값 있어서 그럼. 그러므로 null값 제외하자.
				if(m[i].score>max) {
					max=m[i].score;
				}
			}
		}
		System.out.println(max);
		
		for(int i=0;i<m.length;i++) {
			if(m[i]!=null) { 
				if(m[i].score==max) {
					System.out.println(m[i].title_kr); //점수가 9.5(max)인 애들이 여러개 있을 수 있음. 
				}
			}
		}

		
	}

}
