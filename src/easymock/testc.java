package easymock;
import java.math.*;

public class testc {
	public static void main(String[] args) {
		
//		String x = "20256.5";
//		System.out.println(Integer.parseInt(x));
//		System.out.println((int)x);
//		System.out.println(Integer.parseInt(new java.text.DecimalFormat("0").format(x)));
		float s1 = 22;
		float s2=(float) 40.01;
		float s4 = (float) 18.01;
		
		
		System.out.println("s1===="+s1);
		System.out.println("s2===="+s2);
		float s3 =s2-s1;
		System.out.println("s3===="+s3);
		String sss = String.valueOf(s3);
		System.out.println("ssss======"+sss);
		Float ff = Float.parseFloat(sss);
		System.out.println("fff====="+ff);
		Float dd = ff-s4;
		System.out.println("jianfa ==="+dd);
		
		
		BigDecimal big1 = new BigDecimal("40.01");
		BigDecimal big2 = new BigDecimal("22");
		BigDecimal big3 = big1.subtract(big2);
		System.out.println("big3 ======"+big3);
		
		
//		
	}
	
}
