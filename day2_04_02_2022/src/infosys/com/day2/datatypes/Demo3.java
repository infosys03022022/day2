package infosys.com.day2.datatypes;
/*
 * 12.24
   12.34
   12.123456789012346 //rounding of to 15 places of decimal
   12.123457  // rounding of to 6 places of decimal

 * 
 */
public class Demo3 {

	public static void main(String[] args) {
		//float value=12.24;// Type mismatch cannot convert double to float
        // The above line will give compilation error
		// because it is considered that we are 
		// assigning a double value to a float variable.
	     float value=12.24f;
	     float value1=12.34F;
	     System.out.println(value);
	     System.out.println(value1);
	     // The significance postfixing f/F is to
	     // intimate compiler that the value is a float
	     // value
	     double value3=12.34;
	   // The above line is fine because we are 
	    // assigning double value which is 12.34 to a 
	     // double variable
	     double value4=12.34f;
	     double value5=23.5d;
	     double value6=34.5D;
	     // This is permissible as type conversion is taking place
	     // as float datatype being smaller in byte size can be assigned
	     // to a variable double which is more in the byte size
	     
	     double value6=12.123456789012345676;
	     double value6b=12.123456789012344676;
	     System.out.println(value6);
	     System.out.println(value5b);
	     float value7=12.1234567890f;
	     System.out.println(value7);
	}

}
