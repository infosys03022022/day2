package infosys.com.day2.datatypes;

/*    Output: 1 1
 *    num1 is a variable of int data type and it is assigned with an int constant value in line 10.
 *    in line 11 we have declared another variable num2 without intially assigning any value 
      in line 13 num2 is initialised with a value of num1
 */
public class Demo7 {

	public static void main(String[] args) {
		int num1=1;
		int num2;
		num2=num1;   // num1's value is assigned to num2 variable
		System.out.print(num1+"\t");
		System.out.println(num2);
	}

}
