// ==> 문자 ==> charAt(0) : 글자를 하나씩 
// String s="abacsjsfjkfhadadakdah"
// a가 몇 개 인지 출력해라. 
public class 반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="qkljhqaalwelg,asdigq";
		int num=0;
		int i=0;
		
		//내가 짠 것 
		while(i<=s.length()-1) {  
			// 글자는 0,1,2,... 이런식으로 시작되는데 length는 1,2,3,.. 이렇게 세기 때문에, i와 length의 숫자가 안 맞음. 
			// 예를 들어 글자가 5자면 셀리는 순서가 0,1,2,3,4 이런데 글자수(length)는 마지막이 5가 됨. 
			System.out.println((i+1)+"번째 문자:"+s.charAt(i));
			if(s.charAt(i)=='a'||s.charAt(i)=='A')
				num++;
			i++;
		}
		System.out.println("a의 개수는: "+num+"\n\n");

		
		int count=0;
		int j=0;
		//선생님이 짠 것 - char c=s.charAt(i); 로 따로 두셨음
		while(j<s.length()) {  
			// 글자는 0,1,2,... 이런식으로 시작되는데 length는 1,2,3,.. 이렇게 세기 때문에, i와 length의 숫자가 안 맞음. 
			// 그래서 <=이 아니라 <로 적었음. 
			// 아니면 이해하기 쉽게 i<=s.length()-1로 해도 됨.
			System.out.println((j+1)+"번째 문자:"+s.charAt(j));
			char c=s.charAt(j);
			if(c=='a'||c=='A')
				count++;
			j++;
		}
		System.out.println("a의 개수는: "+num);
				

	}

}
