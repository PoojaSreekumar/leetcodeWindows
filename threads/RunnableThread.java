package threads;


class Thread3 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
public class RunnableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=
		() -> {
			for(int i=0;i<2;i++) {
				System.out.println("Hi");
			}
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName());	
				try {
					Thread.sleep(1000);
					
					//if u use wait() use notify to call it back
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		};
		Thread t1=new Thread(r,"Runnable Thread");
		t1.setPriority(8);
		//default priority is 5 ...starts from 0 to 10
		
		t1.start();
		
		
		
		new Thread(()->System.out.println("Hello")).start();
	}

}
