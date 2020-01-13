/*
 * IO : CheckException ==> 반드시 예외처리!
 * == Input/Output (입/출력)
 * = 메모리 입출력
 *   =========== 표준 
 *	 	  		System.in.read(): 메모리에 있는 값을 읽어올 때
 *   			System.out.println(): 메모리에 있는 값을 출력할 때 
 * = 파일 입출력
 * = 네트워크 입출력 
 * 
 * 라이브러리에서 제공하는 IO => 단점 (단방향) : 즉, 주고 받고를 동시에 할 수 없다.  
 * ====================
 * 		바이트스트림							문자스트림
 * 		========							=======
 * 			┃									┃
 * 	=================						===============
 * 	InputStream OutputStream				Reader	Writer
 * 		
 * 	FileInputStream							FileReader
 * 	FileOutputStream						FileWriter
 * 
 * 	보조장치
 * 	BufferedInputStream						BufferedReader
 * 	BufferedOutputStream					BufferedWriter
 * 
 * 	File
 * 	ObjectInputStream
 * 	ObjectOutputStream
 * 
 * 	== 객체 단위로 저장
 *  ObjectInputSream
 *  ObjectOutputStream
 * 
*/
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
