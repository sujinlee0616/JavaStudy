// Call by Reference(주소) => 배열, 클래스 
// 속도가 더 빨라서 보통은 이걸 더 선호한다. 
/*
 * 	class A{
 * 		int a=10;
 * 	}
 * 	swap (A aa){
 * 		aa.a=1000; //a값을 1000으로 변경했음 
 * 	}
 * 	A aa=new A();
 * 	swap(aa) 
 *  aa.a //1000
*/
public class 메소드2_CallByReference {
	static void swap(int[] arr) {
		System.out.println("변경 전=> swap:arr[0]="+arr[0]+", arr[1]="+arr[1]); //arr[0]=100, arr[1]=200
		// 변경
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		System.out.println("변경 후=> swap:arr[0]="+arr[0]+", arr[1]="+arr[1]); //arr[0]=200, arr[1]=100 <= 변경 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열
		메소드2_CallByReference a=new 메소드2_CallByReference(); //★★new를 쓰면 새로운 메모리가 생성된다★★
		메소드2_CallByReference b=new 메소드2_CallByReference(); 
		메소드2_CallByReference c=new 메소드2_CallByReference();
		System.out.println(a); //a의 주소값  
 		System.out.println(b); //b의 주소값
		System.out.println(c); //c의 주소값이 다 다름 
		int[] arr= {100,200};
		swap(arr); // 주소 전송 (원본)
		System.out.println("main=> swap:arr[0]="+arr[0]+", arr[1]="+arr[1]); //arr[0]=200, arr[1]=100 <= 얘도 변경되었음!!
		// ex) Call by Reference 예시: 게시판에서 특정 게시물 클릭 => 해당 게시물의 조회수 +1 증가시킴

	}

}
