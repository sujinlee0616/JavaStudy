import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


// 카테고리 클릭 (ex. 한식) ==> 해당 카테고리에 맞는 맛집 리스트가 출력됨 ==> 맛집 리스트 클릭 시 상세보기 화면으로 랜딩됨. 
// 1. 카테고리 잡고 2. 상세 보기 잡으면 됨
class Category{
	int cateno; //cno:category number
	String poster;
	String title;
	String subTitle;
	String link;
}
class Food{
	int cateno;
	int no;
	String[] poster=new String[4];  // 클래스 안에 배열도 넣을 수 있다!
	String title;
	double score;
	String addr;
	String tel;
	String type;
	String price;
	String parking;
	String time;
	String menu;
	int good;
	int soso;
	int bad;
}
public class FoodMain {
	Category[] foodCategoryData() throws Exception {
		Category[] cate=new Category[12];
		Document doc=Jsoup.connect("https://www.mangoplate.com/").get();
		Elements title=doc.select("div.info_inner_wrap span.title");
		Elements poster=doc.select("ul.list-toplist-slider img");
		Elements sub=doc.select("div.info_inner_wrap p.desc");
		Elements link=doc.select("ul.list-toplist-slider a");
		for(int i=0;i<12;i++) {
			Category g=new Category();
			g.cateno=i+1;
			// 값을 가져오는 방법 2가지 
			// 1. 태그 사이 : text(); ex) <span>2020 제주 인기 맛집 Top 60</span> 
			// 2. 태그 안 : attr();  ex) <a href="링크 주소"></a> ==> attr("class");
			// 					  ex) <img data-lazy="http://mp-seoul-image.jpg"> ==> attr("data-lazy"); 
			g.title=title.get(i).text(); // <span></span> 사이의 텍스트 가져오기 위해서 text(); 사용했음
			g.subTitle=sub.get(i).text();
			g.poster=poster.get(i).attr("data-lazy");
			g.link=link.get(i).attr("href");
			cate[i]=g; // // 변수명 하나로도 여러개 돌릴 수 있다. 저장공간 주소를 따로 해주면 됨. 
			// 저장할 때 배열에 저장하던가, 메모리에 저장하던가... 하면 됨...
			// 클래스는 변수명이 같아도 다른 주소에 저장하게 할 수 있으므로 유용! 
			
			
		}
		return cate;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
