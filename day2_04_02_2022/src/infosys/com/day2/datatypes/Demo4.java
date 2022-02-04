package infosys.com.day2.datatypes;

/*
 *  The below program will give us compilation error as we have not initialised
 *   // the local variable before the access
 *   But if we comment out the access then there is no error.
 *   int is a datatype and num is variable
 */
public class Demo4 {

	public static void main(String[] args) {
		      int num;
		      //System.out.println(num);
	}

}
