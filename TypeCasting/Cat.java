package TypeCasting;

class Animal {

    public void eat() {
       System.out.println("Animal Eating"); 
    }
    public void legs() {
    	System.out.println("Animal legs");
    }
}

public class Cat extends Animal {

	public void eat() {
		 System.out.println(" Cat Eating"); 
   }

   public void meow() {
	   System.out.println("Meow"); 
   }
   
   public static void main(String args[]) {
	   Cat cat = new Cat();
	   //Implicit upcasting
	   Animal animal = cat;
	   // can't call meow method without downcasting; restricted methods now
	   //meow is not defined for Animal class
	 //  animal.meow();
	   animal.legs();
	//   ((Cat) animal).meow();
	   //explicit downcasting
	 /*  if (animal instanceof Cat) {
           ((Cat) animal).meow();
       }
       */
	   /*
	   //using methods of Class cast() and isInstance() 
	   Animal animal1 = new Cat();
	    if (Cat.class.isInstance(animal1)) {
	        Cat cat1 = Cat.class.cast(animal1);
	        cat1.meow();
	    }
	    */
	   
	   Animal a;
	//   String s = (String) a;
	/*   
	Animal an=new Dog();
	((Cat)an).meow();
	  */
	   
   }
}

class Dog extends Animal{
	
	public void eat() {
		System.out.println("Dog eating");
	}
}
