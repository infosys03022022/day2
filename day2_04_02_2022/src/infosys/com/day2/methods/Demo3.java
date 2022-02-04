package infosys.com.day2.methods;

public class Demo3 {

	/* add method with a return type */
	
	public static void main(String[] args) {
		System.out.println("Before calling add method");
		float result= add(); // method call to add method    //result is local to main
		System.out.println("The value after add "+result);   
		System.out.println("After calling add method");
	}
  // return type is the datatype of the value being returned
	
	public static float add()  
	{
		System.out.println("Before the add method start performing something");
		float num1=12.34f;   
		float num2=13.45f;
		float result=num1+num2;  // result is local to add
		
		System.out.println("The task of add method is complete");
		System.out.println("Before returning to main the value with result is "+result);
	    return result;
	  }
}
