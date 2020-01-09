import java.util.StringTokenizer;
// 지능형 웹 => 데이터 분석 
/*
 *  챗봇(AI) 
*/
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="Java Oracle HTML CSS JavaScript JSP Spring Kotlin";
		StringTokenizer st=new StringTokenizer(data); //data 뒤에 아무것도 안 주면 디폴트인""(공백)으로 자른다.
		while(st.hasMoreTokens()) { //hasMoreTokens : 데이터가 몇 개 들어왔는지 모를 때 사용. 
			System.out.println(st.nextToken());
		}

	}

}
