
public class MainClass {

	public static void main(String[] args) {
		Sawon s1 = new Sawon(); 
		s1.setSabun(1);
		s1.setName("ȫ�浿");
		s1.setDept("���ߺ�");
		s1.setLoc("����");
		s1.setPay(3500);

		System.out.println("���:"+s1.getSabun());
		System.out.println("�̸�:"+s1.getName());
		System.out.println("�μ�:"+s1.getDept());
		System.out.println("�ٹ���:"+s1.getLoc());
		System.out.println("����:"+s1.getPay());
		
		/*
		 * s1 = null; // s1 파괴
		 * System.gc(); // 가비지컬렉터한테 강제로 갖고 가달라고함. null이어야 가비지컬렉터가 갖고갈 수 있음. 
		 */		
		
	}

}
