package threads;

public class WaitAndNotify {
public static void main(String args[]) {
	
	Demo demo=new Demo();
	new Thread(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			demo.print();
		}
		
	}).start();
}


}

class Demo{
	
	synchronized void print() {
		
	}
}
