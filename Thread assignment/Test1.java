
public class Test1 extends Thread {
	public void run() {
		System.out.println("Running "+Thread.currentThread().getName());
	}
	
	public static void main(String args[]) {
		Test1 t1=new Test1();
		t1.start();
	}

}
