package SuperExample;


class Superclass {
	int x=1;
    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }
}
public class Subclass extends Superclass {
	int x=2;
    // overrides printMethod in Superclass
    public void printMethod() {
       super.printMethod();
      System.out.println(super.x);
        System.out.println("Printed in Subclass");
    }
    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.printMethod();  
        System.out.println(s.x);
       
        
    }
}
