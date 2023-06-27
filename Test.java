class Animal{  
void eat(){System.out.println("eating...");}  
}  

class Dog extends Animal{  
void bark()
{
	System.out.println("barking...");
	} 

public String toString()
{
	return "Dog";
	}  
	
}

public class Test{  
	
public static void main(String args[]){  
Dog d=new Dog();  
d.bark();  
d.eat();  
System.out.println(d);
}
}  