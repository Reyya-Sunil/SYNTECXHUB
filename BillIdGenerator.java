package Object.Project.Restaurant_Billing_System;
import java.lang.Math;
public class BillIdGenerator {
	public static int  generateBillId() {
		long id = System.currentTimeMillis();
		int res = Math.abs((int) id);// for positivie number and type casting to int 
		return res ;
	}
}
