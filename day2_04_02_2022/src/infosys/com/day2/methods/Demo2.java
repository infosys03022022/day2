package infosys.com.day2.methods;

// The local variables are accessible within the method only
// So in the below example result in main is different from result in add
// they have their own local scopte
public class Demo2 {

	/* add method with a return type */
	
	public static void main(String[] args) {
		System.out.println("Before calling add method");
		int result= add(); // method call to add method    //result is local to main
		System.out.println("The value after add "+result);   
		System.out.println("After calling add method");
	}
  // return type is the datatype of the value being returned
	
	public static int add()  
	{
		System.out.println("Before the add method start performing something");
		int num1=10;   
		int num2=20;
		int result=num1+num2;  // result is local to add
		
		System.out.println("The task of add method is complete");
		System.out.println("Before returning to main the value with result is "+result);
	    return result;
	  }
}
