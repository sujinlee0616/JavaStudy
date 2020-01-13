package com.sist.io2;
/*
 *  Thread를 사용하는 방법
 *  ====== 한 가지 일만 사용하게 만든다 
 *  =================
 *  	1. Runnable(interface) 이용하는 방법
 *  	   => 클라이언트 (윈도우)
 *  	   => run() 메소드 구현 => 쓰레드 동작
 *  	   class A implements Runnable 
 *  	2. Thread를 상속받아서 처리 
 *  	   => Thread의 역할을 확장
 *  	   class A extends Thread
 *  	===> 동작하는 방법 
 *  	INIT (생성 :created) ===> Runnable (대기) ===> Running (동작) ===> 일시정지
 *  	==================
 *  	Thread t1=new Thread()		t1.start()			run()			sleep(),wait()
 *  	Thread t2=new Thread()		t2.start()			run()			sleep(), wait()
 *   	// run을 호출하면 안 되고 start를 호출하면 걔가 run을 호출한다. 
 *   
 *    	또는.... INIT (생성 :created) ===> Runnable (대기) ===> Running (동작) ===> 쓰레드 종료. 
 *     	==================
 *  	Thread t1=new Thread()		t1.start()			run()			interrupt(), join()
 *  	Thread t2=new Thread()		t2.start()			run()			interrupt(), join()
 *  
 *  	=> JVM
 *  		1. 이름을 부여 ex) thread-0, thread-1, ....
 *  		2. 순위를 부여 : 1~10 	
 *  			┗ 1 : MIN_PRIORITY ===> gc
 *  			┗ 10 : MAX_PRIORITY ===> 메인 메소드. 
 *  			┗ 5 : NORM_PRIORITY ===> 우리가 만든 쓰레드 
 *  
 *  	※ 쓰레드는... CPU가 시간을 나눠서 동작할 수 있게 해주는 프로그램... 이라고 생각하면 됨...
 *  	※ 쓰레드를 여러개 만들 때는 인터페이스 상속받을 수 없다. ===> 쓰레드를 따로따로 만들어야 ==> runnable을 쓰는 건 한 가지 기능만 있을 때.  
 *  
*/
class MyThread extends Thread
{
	public void run() 
	{
		for(int i=1;i<=10;i++) 
		{
			System.out.println(getName()+":"+i); //1~10 출력하는 서버..
			try 
			{
				Thread.sleep(50);
			}catch(Exception ex) {}
		}
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
		// 생성
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		
		t1.setName("홍길동");
		t2.setName("심청이");
		t3.setName("박문수");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		// 필요한 데이터 가지고 오기
		t1.start();
		t2.start();
		t3.start();
		
		// 1~10 출력 동작 
		// 위에서 스타트 걸었으니까 자동으로 t1.run(), t2.run(), t3.run()이 호출될거임. 
		
		
	}

}


