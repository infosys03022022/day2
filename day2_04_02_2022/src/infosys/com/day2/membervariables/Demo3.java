package infosys.com.day2.membervariables;

/* 
 *   The below code is accessing the non static 
 *   member of a class after declaring the object
 *   of that class.
 * 
 */
public class Demo3 {
   int num1=10;      // num1 and alpha are instance variables/member variables
   char alpha='a';
	 
	public static void main(String[] args) {
	 //Demo3 d;  // Demo3 is a class and d is a reference 
	 // variable of Demo3 type
     //d=new Demo3(); // we are creating an object of type 
     // Demo3 and the reference/address of newly created
     // object is assigned to the the reference variable d.
     // int num;
	// num=10;
	
	// In the following line 
   // new Demo3() is basically creating an object during
// the runtime or execution time.
// The reference of the newly created object 
// is assigned to d which is a reference variable of type
// Demo3
	Demo3 d=new Demo3();
     int num=10;
     System.out.println(d.num1);
     System.out.println(d.alpha);
		
		
	}

}
