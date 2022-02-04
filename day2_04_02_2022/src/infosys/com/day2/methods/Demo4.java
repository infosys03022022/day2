package infosys.com.day2.methods;
public class Demo4 {
/* add method with a return type */
	
	public static void main(String[] args) {
		System.out.println("Before calling add method");
		float val1=12.34f;
		float val2=23.45f;
		// We are making a call to add method method and we are passing 2 float values as arguements
		// while calling the method we pass only the variable and datatype of the variable is
		// not required with the arguement mentioned because the variable are already declared
		// in the caller scope. main the caller method and add is the called method.
		float result=add(val1,val2); // method call to add method    //result is local to main
		System.out.println(result);
		System.out.println("After calling add method");
	}
  // return type is the datatype of the value being returned
	
	public static float add(float num1, float num2)  // num1 and num2 are parameters  
	{
		System.out.println("Before the add method start performing something");
		float result=num1+num2;  // result is local to add
		System.out.println(result);
		System.out.println("The task of add method is complete");
		return result;
	
	    
	  }
}
