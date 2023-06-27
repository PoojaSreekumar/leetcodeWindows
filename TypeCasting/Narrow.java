package TypeCasting;

public class Narrow  
{  
public static void main(String args[])  
{  
double d = 166.66;  

//converting double data type into long data type  
long l = (long)d;  
//converting long data type into int data type  
int i = (int)l;  
System.out.println("Before conversion: "+d);  
//fractional part lost  
System.out.println("After conversion into long type: "+l);  
//fractional part lost  
System.out.println("After conversion into int type: "+i); 



double num = 10.99;
System.out.println("The double value: " + num);
int data = (int)num;
System.out.println("The integer value: " + data);

double d1=Double.MAX_VALUE;
System.out.println("The double value: " + d1);
int data1 = (int)d1;
System.out.println("The integer value: " + data1);
}  
}  