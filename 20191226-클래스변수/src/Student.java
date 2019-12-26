class StudentVO{
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	char hakjum;
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ¸Þ¸ð¸® ÀúÀå 
		
		
		StudentVO vo1=new StudentVO();
		vo1.name="È«±æµ¿";
		vo1.kor=90;
		vo1.eng=80;
		vo1.math=70;
		vo1.total=vo1.kor+vo1.eng+vo1.math;
		vo1.avg=vo1.total/3.0;
		
		vo1.hakjum='A';
		switch((int)(vo1.avg/10)) {
		case 10: case 9:
			vo1.hakjum='A';
			break;
		case 8:
			vo1.hakjum='B';
			break;
		case 7:
			vo1.hakjum='C';
			break;
		case 6:
			vo1.hakjum='D';
			break;
		default :
			vo1.hakjum='F';
		}
		
		StudentVO vo2=new StudentVO();
		vo2.name="È«±æµ¿";
		vo2.kor=90;
		vo2.eng=80;
		vo2.math=70;
		vo2.total=vo2.kor+vo2.eng+vo2.math;
		vo2.avg=vo2.total/3.0;
		
		vo2.hakjum='A';
		switch((int)(vo2.avg/10)) {
		case 10: case 9:
			vo2.hakjum='A';
			break;
		case 8:
			vo2.hakjum='B';
			break;
		case 7:
			vo2.hakjum='C';
			break;
		case 6:
			vo2.hakjum='D';
			break;
		default :
			vo2.hakjum='F';
		}
		
		
		StudentVO vo3=new StudentVO();
		vo3.name="È«±æµ¿";
		vo3.kor=90;
		vo3.eng=80;
		vo3.math=70;
		vo3.total=vo3.kor+vo3.eng+vo3.math;
		vo3.avg=vo3.total/3.0;	
		
		vo3.hakjum='A';
		switch((int)(vo3.avg/10)) {
		case 10: case 9:
			vo3.hakjum='A';
			break;
		case 8:
			vo3.hakjum='B';
			break;
		case 7:
			vo3.hakjum='C';
			break;
		case 6:
			vo3.hakjum='D';
			break;
		default :
			vo3.hakjum='F';
		}
		
		StudentVO vo4=new StudentVO();
		vo4.name="È«±æµ¿";
		vo4.kor=90;
		vo4.eng=80;
		vo4.math=70;
		vo4.total=vo4.kor+vo4.eng+vo4.math;
		vo4.avg=vo4.total/3.0;	
		
		vo4.hakjum='A';
		switch((int)(vo4.avg/10)) {
		case 10: case 9:
			vo4.hakjum='A';
			break;
		case 8:
			vo4.hakjum='B';
			break;
		case 7:
			vo4.hakjum='C';
			break;
		case 6:
			vo4.hakjum='D';
			break;
		default :
			vo4.hakjum='F';
		}
		
		StudentVO vo5=new StudentVO();
		vo5.name="È«±æµ¿";
		vo5.kor=90;
		vo5.eng=80;
		vo5.math=70;
		vo5.total=vo5.kor+vo5.eng+vo5.math;
		vo5.avg=vo5.total/3.0;
		
		vo5.hakjum='A';
		switch((int)(vo5.avg/10)) {
		case 10: case 9:
			vo5.hakjum='A';
			break;
		case 8:
			vo5.hakjum='B';
			break;
		case 7:
			vo5.hakjum='C';
			break;
		case 6:
			vo5.hakjum='D';
			break;
		default :
			vo5.hakjum='F';
		}
		
		
		System.out.println("==========°á°ú Ãâ·Â==========");
		System.out.println();

	}

}
