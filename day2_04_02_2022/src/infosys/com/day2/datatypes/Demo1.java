package infosys.com.day2.datatypes;

/*   The output of the code:
  *   a
     data
     The value of data isa
 * 
 *     char is a datatype 
 */

public class Demo1 {
	public static void main(String[] args) {
	      char data='a'; // if the data type is char primitive type we intialise
	                     // with a single character , and that character can be
	                     // a alphabet, special characters or numbers
	      //char data1='-1'; // We cannot write data1 because
	      char data1='1';
	      char data2='-';
	      char data3='*';
	      //two character are there - and 1
	      System.out.println(data); // while accessing the variable we don't use
	       // variable within quotes
	      System.out.println("data");// So here it is no longer being treated as
	      // a variable but is considered as a string
	      System.out.println("The value of data is"+data); // Here we have
	      // appended with a string the variable data which is of type int
	}

}
