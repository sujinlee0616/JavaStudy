public class StudentSystem {
	
	public int totalData(int kor, int eng, int math)
	{
		return kor+eng+math;
	}
	
	public double avgData(int total)
	{
		return total/3.0;
	}
	
	public char scoreData(double avg)
	{
		char c='A';
		switch ((int)(avg/10)) 
		{
		case 10: case 9: c='A'; break;
		case 8: c='B'; break;
		case 7: c='C'; break;
		case 6: c='D'; break;
		default: c='F';
		}
		return c;
	}
	
	public void hakjumData(Student s)
	{
		//총점
		//call by reference
		s.setTotal(s.getKor()+s.getEng()+s.getMath());
		
		//평균
		s.setAvg(s.getTotal()/3.0);
		
		//학점
		char c='A';
		switch ((int)(s.getAvg()/10)) 
		{
		case 10: case 9: c='A'; break;
		case 8: c='B'; break;
		case 7: c='C'; break;
		case 6: c='D'; break;
		default: c='F';
		}
		s.setScore(c);
	}
}
