package mypackage;

public class Employee
{
//private float salary=40000;  
	public float salary=30000;
//	float salary=20000;
	//protected float salary=10000;
	
}  
class Programmer extends Employee{  
int bonus=10000;  
public static void main(String args[]){  
  Programmer p=new Programmer();  
  System.out.println("Programmer salary is:"+p.salary);  
  System.out.println("Bonus of Programmer is:"+p.bonus);  
}  
}  