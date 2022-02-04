package infosys.com.day2.methods;

public class Demo1 {

	// This a method being defined as add
	// public ===> is an access specifier
	// static===> is a modifier 
	// void ====> is a return type
	// add===> add is a method name
	//with method we follow the convention of 
	// writing the word entirely in small case
	// num1,num2 and result are local variable
	// to add method
	// Output as 30
	// The methods called by add can be defined before or after main in the same class
	/* public static void add()  
	{
		System.out.println("Before the add method start performing something");
		int num1=10;   
		int num2=20;
		int result=num1+num2;
		System.out.println(result);
		System.out.println("The task of add method is complete");
	}*/
	
	public static void main(String[] args) {
		   System.out.println("Before calling add method");
		   add(); // method call to add method    
		   System.out.println("After calling add method");
	}
  
	//add(); we cannot any statement outside a method
  	int num1=1;
  	int num2=2;
  	//System.out.println(num1+num2);
	public static void add()  
	{
		System.out.println("Before the add method start performing something");
		int num1=10;   
		int num2=20;
		int result=num1+num2;
		System.out.println(result);
		System.out.println("The task of add method is complete");
	}
}
