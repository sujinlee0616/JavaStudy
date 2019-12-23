import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/* <td class="info">
    	<a href="#" class="title ellipsis" title="재생" onclick="fnPlaySong('89741945','1');return false;">
        	다시는 사랑하지 않고, 이별에 아파하기 싫어</a>
		<a href="#" class="artist ellipsis" onclick="fnViewArtist('14936387');return false;">백지영</a>
     		<div class="toggle-button-box" >
                 <button type="button" class="btn artist-etc" onclick="fnRelationArtistList('89741945');">외</button>
                 <ul class="list" id="RelationArtist_89741945"></ul>
            </div>                                
        <i class="bar">|</i>
        <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer('81337060');return false;">다시는 사랑하지 않고, 이별에 아파하기 싫어</a>
     </td>                       
*/
public class 메소드2_JSoup {
	static String[] getMusicTitle() throws Exception {
		String[] list=new String[50];
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		//두세글자 쓰고 Ctrl+space 눌러서 선택해야 자동으로 import됨 ㅠㅠ 실수하지 말자..
		//에러난 부분 클릭하면 왜 에러났는지 알려줌... 
		Elements title=doc.select("td.info a.artist");
		for(int i=0;i<50;i++) {
			list[i]=title.get(i).text();
		}
		return list;
	}
	// 1|제목|가수명|앨범|100 이렇게 String으로 만들고 | 기준으로 자르자 (split) 
	// 전체 데이터 ==>  
	//
	static String getMusicInfo(int no) throws Exception {
		String res="";

		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements singer=doc.select("td.info a.artist");
		Elements album=doc.select("td.info a.albumtitle");
		for(int i=0;i<50;i++) {
			if(i==(no-1)) {
				res=singer.get(i).text()+"|"+album.get(i).text();
				break;
			}
		}
		return res;
	}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[] title=getMusicTitle();
		System.out.println("==========지니뮤직top50==========");
		for(String s:title) {
			System.out.println(s);
		}
		System.out.println("================================");
		Scanner scan=new Scanner(System.in);
		//Scanner 쓸 때도 마찬가지로  Ctrl+space 눌러서 선택해야 import됨 ㅠㅠ 실수하지 말자..
		/*
		 * System.out.print("검색할 제목 입력:"); String name=scan.next(); for(String s:title)
		 * { if(s.contains(name)) { System.out.println(s); } }
		 */
		System.out.println("상세 볼 음악 번호 입력(1~50):");
		int no=scan.nextInt();
		String detail=getMusicInfo(no);
		String[] value=detail.split("\\|"); //<== '|'을 기준으로 잘라줘라. 
		// $, . , ^, |, ? 이런 애들은 앞에 \\ 붙여줘야함. !!
		// StringTokenizer <== 패턴 없이 자르는 방법. (나중에 배울 예정).  
		System.out.println("가수명:"+value[0]);
		System.out.println("앨범명:"+value[1]);
	}

}







