package interfaceExample;

public class Dragon implements EggLayer, Animal,Egg {
    public static void main (String[] args) {
        Dragon myApp = new Dragon();
        System.out.println(myApp.identifyMyself());
    }
    
    public void identify() {
    	System.out.println(" implemented");
    }
    
}
 interface Animal {
    default public String identifyMyself() {
        return "I am an animal.";
    }
    
    
}
 interface EggLayer extends Animal {
    default public String identifyMyself() {
        return "I am able to lay eggs.";
    }
default public void identify() {
    	
    }
    
 }
    
    interface Egg extends Animal{
    	
    default public void identify() {
        	
        }
        
        
    }

