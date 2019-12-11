import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.Scanner;
public class 반복문7 {

	public static void main(String[] args) throws Exception {
		
		//검색어 입력받기
		//Scanner scan=new Scanner(System.in);
		//System.out.println("검색어 입력 (곡명):");
		//String fd=scan.next();
		
		
		int k=1;
		while(k<=4) {
			// 지니뮤직에서 Top50 곡명 가져오기
			//Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			//지니뮤직에서 TOP200 가져오기 (1~50,51~100,101~150,151~200 - 총 4페이지 긁어옴) 
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20191211&hh=15&rtm=Y&pg="+k).get();
			//소스전체긁어오기
			//System.out.println(doc);
			Elements title=doc.select("td.info a.title");
			Elements singer=doc.select("td.info a.artist");
			
			//50개씩 가져옴 --> 번호는 1~50이 4번 나옴. 
			int i=0;
			while(i<title.size()) {
				//곡명을 변수로 설정
				String data=title.get(i).text();
				//곡명과 검색어가 일치하면 출력
				//if(data.contains(fd)) {
					System.out.println(data);
					System.out.println((i+1)+"가수:"+singer.get(i).text());
					System.out.println("============================");
				//}
				i++;
			}
			k++;
		}
		
		

	}

}
