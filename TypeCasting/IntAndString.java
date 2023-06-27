package TypeCasting;

public class IntAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
	    System.out.println("The integer value is: " + num);

	    // converts int to string type
	    String data = String.valueOf(num);
	    System.out.println("The string value is: " + data);
	    
	    String data1 = "20";
	    System.out.println("The string value is: " + data1);

	    // convert string variable to int
	    int num1 = Integer.parseInt(data1);
	    System.out.println("The integer value is: " + num1);
	    
	    String data2 = "Hi10";
	    System.out.println("The string value is: " + data2);

	    // convert string variable to int
	    //NumberFormatException
	  //  int num2 = Integer.parseInt(data2);
	//    System.out.println("The integer value is: " + num2);
	    
	    int a = 67;
	    char b = (char) a;
	    System.out.println(b);
	    
	    int a1=1;
	    char b1=(char)(a1+'0');
	    System.out.println(b1);
	    //ASCII equivalent of 49 is '1'. '0' is 48
	    
	}

}
