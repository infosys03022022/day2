package infosys.com.day2.membervariables;

/* 
 *   The below code will give compilation error
 *   as main is a static method and num1 and alpha
 *   are non static
 * 
 */
public class Demo2 {
   int num1=10;
   char alpha='a';
	 
	public static void main(String[] args) {
		System.out.println(num1);
		System.out.println(alpha);
	}

}
