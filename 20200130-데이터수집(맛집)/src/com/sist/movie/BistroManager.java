package com.sist.movie;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BistroManager {
	public ArrayList<BistroVO> movieListData()
	{
		ArrayList<BistroVO> list = new ArrayList<BistroVO>();
		try {
			BistroDAO dao=new BistroDAO();
			for(int i=1;i<=12;i++) // 페이지 수. 1페이지인 애는 주석처리. 
			{
				Document doc=Jsoup.connect("https://www.menupan.com/restaurant/bestrest/bestrest.asp?page="+i+"&trec=294&areacode=ss218&pt=rt").get();
				// movieId 긁으려고 a태그 가져오자. 
				Elements link=doc.select("span.restName a"); // 다 똑같이 a태그니까 Elements 사용가능  
				// 
				for(int j=0;j<link.size();j++)
				{
					try {
						Element elem=link.get(j);
						//System.out.println((i)+"-"+elem.attr("href")); // a 태그의 속성(ex.href)을 가져오고 싶으면  'attr'을 사용해야함.
						//System.out.println((i)+"-"+elem.text()); // 이렇게 하면 a 태그의 값을 가져옴 ==> 영화제목			
						String mLink="https://www.menupan.com/"+elem.attr("href"); // mLink에 영화 상세페이지 링크 저장  
						Document doc2 = Jsoup.connect(mLink).get(); //doc2는 URL(mLink)에 접속해 Document(HTML)를 가져온다. 
						//System.out.println(doc2); //doc2가 mLink의 Document 가져오는 것 확인 
						
						/*
						 * private int mno;
						 * private String title;
						 * private double score;  
						*/						
						Element title=doc2.selectFirst("div.areaBasic dl.restName dd.name"); 
						System.out.println(title.text());
						Element score= doc2.selectFirst("div.areaBasic dl.restGrade p.score span.total");
						System.out.println(score.text());
												
						BistroVO vo = new BistroVO();
						vo.setTitle(title.text());
						vo.setScore(Double.parseDouble(score.text()));
						
						dao.bistroInsert(vo);
						
					} catch (Exception ex) {}				
					
				}
			}
			System.out.println("DataBase Insert End....");
		} catch (Exception ex) {}
		return list;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BistroManager m = new BistroManager();
		m.movieListData();
	}

}



/* <Jsoup으로 값 추출>
 * 구성요소.text(); : 구성요소 값을 반환(태그는 포함하지 않음)
 * 구성요소.attr("속성이름"); : 구성요소 "속성이름"에 대한 값을 반환
 * 구성요소.html(); : 구성요소 값을 반환(태그도 포함)
 * 구성요소.outerHtml(); : 구성요소를 반환(태그와 값 모두)
 * 
 * ex) 
 * <div class="a">
 * 		<p>aaaa</p>
 * 		<a href="https://www.daum.net/">bbb</a>
 * </div>
 * 
 * 위의 값들을 추출해보자...
 * div.a p 	=> text() 		==> aaaa
 * div.a a 	=> attr("href") ==> https://www.daum.net/
 * div.a 	=> text() 		==> aaaa bbb
 * 			   html()		==> <p>aaaa</p>
 * 								<a href="https://www.daum.net/">bbb</a>
 */