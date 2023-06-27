package staticexp;

class Apple {
    public static void test() {
        System.out.println("The static method in Apple");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Apple");
    }
}
public class Mango extends Apple{


    public static void test() {
        System.out.println("The static method in Mango");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Mango");
    }

    public static void main(String[] args) {
        Mango m = new Mango();
        Apple a=new Apple();
        Apple am=new Mango();
        am.testInstanceMethod();
        am.test();
        m.testInstanceMethod();
        m.test();
        a.testInstanceMethod();
        a.test();
       
    }
	

}

