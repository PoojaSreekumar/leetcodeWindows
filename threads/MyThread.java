package threads;

class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i+Thread.currentThread().getName());
		}
	}
}
class MyThread2 extends Thread{
	public void run()
{
		for(int i=10;i<15;i++) {
			System.out.println(i+Thread.currentThread().getName());
		}
		
		}
}
public class MyThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread1 t1=new MyThread1();
		MyThread2 t2=new MyThread2();
		//main thread would call the run
		/*t1.run();
		t2.run();
		*/
		//2 threads are created
		t1.setName("Thread 11");
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		System.out.println(t1.isAlive());
	
		System.out.println("Hello");
		System.out.println(Thread.currentThread().getName());

	}

}
