package infosys.com.day2.membervariables;

/* 
 *   The below code will work because static method
 *   main is accessing the static method num1 and alpha
 * 
 */
public class Demo1 {
   static int num1=10;
   static char alpha='a';
	 
	public static void main(String[] args) {
		System.out.println(num1);
		System.out.println(alpha);
	}

}
