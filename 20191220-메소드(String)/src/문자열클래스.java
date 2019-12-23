// String: ¹®ÀÚ¿­À» Á¦¾î 
/*
 * java.lang => import¸¦ »ı·«ÇÒ ¼ö ÀÖ´Ù. 
 * 
 * <¹®ÀÚ¿­À» ÀúÀåÇÏ´Â ¹æ¹ı> 
 * 	1) String º¯¼ö¸í="Hello Java"; 
 * 	2) String º¯¼ö¸í=new String("Hello Java"); // °°Àº ¹®ÀÚ¿­ => µû·Î ÀúÀå 
 * 				   ====
 * 				      »õ·Î¿î ¸Ş¸ğ¸®¿¡ ÀúÀå
 * <String¿¡¼­ Á¦°øÇÏ´Â ±â´É>
 * 	1) equals: ÀúÀåµÈ ¹®ÀÚ¿­ÀÌ °°ÀºÁö ¿©ºÎ È®ÀÎ (true/false)
 * 		ID/PW ºñ±³, ·Î±×ÀÎ ½Ã ¸¹ÀÌ »ç¿ë. (´ë¼Ò¹®ÀÚ ±¸ºĞ) 
 * 		¹®ÀÚ¿­Àº (==)À» »ç¿ëÇÏ¸é ¾È µÊ.
 * 		ex) String s="Hello";
 * 			String s1="Hello";
 * 			String s2=new String("Hello");
 * 			if(s==s1) <== true. ¹®ÀÚ¿­°ú ¹®ÀÚ¿­. ÁÖ¼Ò°¡ °°±â ¶§¹®. °°Àº °ø°£¿¡ ÀúÀåµÇ¾î ÀÖ¾î¼­ true³ª¿È. 
 * 			if(s==s2) <== false. ³»¿ëÀº °°¾Æµµ 'new'·Î ¡Ú»õ·Î¿î °ø°£¡Ú¿¡ ÀúÀåµÆ±â ¶§¹®.
 * 			if(s.equals(s2)) <==true. µ¥ÀÌÅÍ °ªÀÌ ¶È°°±â ¶§¹®. 		
 * 		=> ¿øÇü
 * 		   boolean (¸®ÅÏÇüÀÌ ºÒ¸°. °á°ú°ªÀÌ true/false) equals(String data)  
 * 	2) substring: ¹®ÀÚ¿­À» ÀÚ¸¦ ¶§ ¡ÚºóÃâ¡Ú
 * 		Çü½Ä)
 * 		substring(int start)
 * 		substring(int start, int end)
 * 		ex) String s="0123456789";
 * 			substring(3) => "3456789";
 * 		ex) String s="112ºĞ,15¼¼ÀÌ»ó°ü¶÷°¡";
 * 			substring(0,3) => "112"
 * 						==
 * 						end-1 ==> 012¹øÀ» °¡Á®¿È. <== 'end-1'¹ø ±ÛÀÚ±îÁö °¡Á®¿È¿¡ À¯ÀÇ!!
 * 	3) length: ¹®ÀÚ¿­ °¹¼ö 
 * 		String s="Hello È«±æµ¿"; // sÀÇ length´Â 9ÀÓ. ¿µ¹®ÀÌ´ø ÇÑ±ÛÀÌ´ø ´Ù charÇÏ³ª¸¦ 2byte, ÇÑ±ÛÀÚÀÓ. 
 * 		ex) µğÀÚÀÎÇÒ ¶§ ¸¹ÀÌ ¾¸. ¿¹¸¦ µé¾î Å¸ÀÌÆ² Á¦¸ñÀÌ 20±ÛÀÚ ³ÑÀ¸¸é ÀÚ¸£°í '...' ºÙÀÌ°Ô.  
 * 	4) trim: ÁÂ¿ìÀÇ °ø¹é¹®ÀÚ¸¦ Á¦°Å
 * 		ex) String s="Hello Java"; ==> s.length : 10°³, s.trim().length : 10°³ (°¡¿îµ¥ °ø¹éÀº Á¦°ÅX)
 * 		ex) String s="   Hello Java    "; (ÁÂ°ø¹é3,¿ì°ø¹é4) ==> s.length : 17°³, s.trim().length : 10°³  
 * 	5) startsWith, endsWith : ½ÃÀÛÇÏ´Â/³¡³ª´Â ±ÛÀÚ Ã£´Â °Í 
 * 		startsWith("ÀÚ¹Ù"): 'ÀÚ¹Ù'·Î ½ÃÀÛÇÏ´Â °Í Ã£¾Æ¶ó
 *  	endsWith("ÀÔ´Ï´Ù"): 'ÀÔ´Ï´Ù'·Î ³¡³ª´Â °Í Ã£¾Æ¶ó  
 * 	6) indexOf, lastIndexOf: ¹®ÀÚ°¡ ¸î ¹øÂ°¿¡ ÀÖ´ÂÁö Ã£À½.  
 * 		indexOf: ¾Õ¿¡¼­ºÎÅÍ ¹®ÀÚ À§Ä¡ Ã£À½.
 * 		lastIndexOf: µÚ¿¡¼­ºÎÅÍ Ã£À½. ¸ÇµÚ°¡ 0¹øÀÌ¶õ°Ç ¾Æ´Ô. ±×³É µÚ¿¡¼­ºÎÅÍ Ã£´Â´Ü ¶æ. È®ÀåÀÚ °¡Á®¿Ã ¶§ »ç¿ëÇÏ±âµµ. 
 * 		ex) String s="Hello Java";
 * 					  0123456789
 * 			s.indexOf('a') ==> 7
 * 			s.lastindexOf('a') ==> 9  
 * 	7) split: ¹®ÀÚ¿­ ÀÚ¸£±â. ÁöÁ¤ÇÑ ´ë»óÀ» °æ°è·Î Àß¶óÁØ´Ù.  
 * 		ex) String s="ÀÌº´Çå, ÇÏÁ¤¿ì, ¸¶µ¿¼®, ÀüÇıÁø, ¼öÁö";
 * 			String[] names=s.split(","); ==> ¹è¿­ names¿¡ {ÀÌº´Çå, ÇÏÁ¤¿ì, ¸¶µ¿¼®, ÀüÇıÁø, ¼öÁö}°¡ µé¾î°¨
 * 			Á¤±Ô½Ä ¾²¸é splitÀÇ ´õ È°¿ëµµ°¡ ³ô´Ù!
 * 			====
 * 				Á¤±Ô½ÄÀº ³ªÁß¿¡ ´Ù·ì´Ï´Ù. 
 * 				ex) IP ÁÖ¼Ò 
 * 					211.238.142.181
 * 					2111.238.142.180
 * 					211.238.142.1
 * 					211.238.142.23
 * 					211.238.142.0
 * 					211.238.1.1
 * 					IPÁÖ¼Ò Á¤±Ô½Ä : [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3} 
 * 					// 1)0¿¡¼­ 9±îÁö ÀÖ´Â ¼ıÀÚ, 2)1ÀÚ¸®¿¡¼­ 3ÀÚ¸®±îÁö ÀÖ´Ù 3).ÀÌ ÀÖ´Ù(\\.) : ÆĞÅÏ 
 * 				ex) ÀÌ¸ŞÀÏ ÁÖ¼Ò Á¤±Ô½Ä : ^.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/;
 * 	8) toUpperCase, toLowerCase
 * 		toUpperCase: ´ë¹®ÀÚ·Î º¯È¯
 * 		toLowerCase: ¼Ò¹®ÀÚ·Î º¯È¯
 * 		ex) String s="Hello";
 * 			s.toUpperCase() ==> HELLO
 * 			s.toLowerCase() ==> hello 
 * 	9) replace, replaceAll 
 * 		replace: º¯°æ 
 * 		ex) String s="Hello Java";  
 * 			s.replace('a','b'); ==> Hello Jbvb 
 * 		relaceAllµµ Á¤±Ô½ÄÀÌ ºÙ´Â´Ù.
 * 		ex) String s="113ºĞ"; 
 * 			s.replaceAll("[^0-9]","") ==> ¼ıÀÚ¸¦ Á¦¿ÜÇÏ°í(¼ıÀÚ°¡ ¾Æ´Ñ °ÍÀº) ¸ğµç¾ÖµéÀ» ¾ø´Â°É·Î ¹Ù²ã¶ó(¼ıÀÚ »©°í ´Ù Áö¿ö¶ó) ==> °á°ú: 113
 * 			s.replaceAll("[^0-9$]","") ==> ¼ıÀÚ·Î ½ÃÀÛÇØ¼­ ¼ıÀÚ·Î ³¡³ª´Â °Í »©°í´Â ´Ù Áö¿ö¶ó.
 * 			s.replaceAll("[^°¡-ÆR]","") ==> ÇÑ±Û »©°í  ´Ù Áö¿ö¶ó 
 * 			s.replaceAll("[^A-Za-z]","") ==> ¿µ¹® »©°í  ´Ù Áö¿ö¶ó
 * 	10) contains(): Æ÷ÇÔµÈ ¹®ÀÚ¸¦ Ã£´Â °æ¿ì
 * 	
*/

import java.util.Scanner;
public class ¹®ÀÚ¿­Å¬·¡½º {
	
	static String[] autoComplete(String data) {
		String[] ss= {
				"ÀÚ¹Ù¿Í JSP","ÀÚ¹Ù ÇÁ·Î±×·¡¹Ö","½ºÇÁ¸µ 5","Ajax¿Í JSP","Redux¿Í ",
				"ÀÚ¹Ù ¿À¶óÅ¬","MVC ±¸Á¶","ÄÚÆ²¸°°ú ¾Èµå·ÎÀÌµå","ÄÚÆ²¸° ÇÁ·Î±×·¥","½ºÇÁ¸µ µ¥ÀÌÅÍ",
				"È¥ÀÚ ¹è¿ì´Â ÀÚ¹Ù","Áö´ÉÇüÀ¥ ÇÁ·Î±×·¥","À¥ ÇÁ·Î±×·¥","ÀÚ¹Ù À¥ÇÁ·Î±×·¥","¿À¶óÅ¬ÀÚ¹Ù"};
		String[] findData=new String[10];
		int j=0;
		for(int i=0;i<ss.length;i++) {
			//if(ss[i].startsWith(data)) 
			if(ss[i].contains(data)) 
			{
				findData[j]=ss[i];
				j++;
			}
		}
		return findData;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("°Ë»ö¾î ÀÔ·Â:");
		String data=scan.next();

		String[] fd=autoComplete(data);
		for(int i=0;i<fd.length;i++) {
			if(fd[i]!=null) {
				System.out.println(fd[i]);
			}
		}
	}

}

