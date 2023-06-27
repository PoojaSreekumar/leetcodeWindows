
package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
	}
	
}
class TaskCal implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return 1;
	}
	
}
public class Executor {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
/*		// TODO Auto-generated method stub
 */
		///io intensive
		/*
ExecutorService exec=Executors.newFixedThreadPool(10);
for(int i=0;i<20;i++) {
	//add tasks to blocking queue is thread safe
	exec.execute(new Task());
}
*/

		/*
int corecount=Runtime.getRuntime().availableProcessors();
ExecutorService serv1=Executors.newFixedThreadPool(corecount);
for(int i=0;i<20;i++) {
	//cpu intensive tasks
	serv1.execute(new Task());
}
*/
		
/*
//synchronized queue holds only 1 task but creates thread if threads are not available
//cached pool will remove unused threads
ExecutorService  exec2=Executors.newCachedThreadPool();

//delayqueue more threads created accordingly, run threads randomly based on the delay
ScheduledExecutorService exec3=Executors.newScheduledThreadPool(10);
exec3.schedule(new Task(), 10, TimeUnit.SECONDS);
//initial 10s delay repeat every 20s
exec3.scheduleAtFixedRate(new Task(), 10,20, TimeUnit.SECONDS);
exec3.scheduleWithFixedDelay(new Task(), 20, 20, TimeUnit.SECONDS);

//only 1thread so tasks are executed after completing the b4 one
ExecutorService exec4=Executors.newSingleThreadExecutor();
exec4.execute(new Task());

*/
		

//Callable
ExecutorService excal=Executors.newFixedThreadPool(3);
//Future placeholder
Future<Integer> future=excal.submit(new TaskCal());
//perform some unrealted operations
//this is a blocking opertaion till future gets value
System.out.println(future.get());
Integer val=future.get().intValue();
System.out.println(future.cancel(true));

System.out.println(future.isCancelled());
System.out.println(future.isDone());

/*
List<Future> list=new ArrayList<>();
for(int i=0;i<4;i++) {
	Future<Integer> f=excal.submit(new TaskCal());
	list.add(f);
}
*/

//if future takes lots of time
//f.cancel(false);


//future.get() blocks the main thread so to run many tasks one after the other without
//blocking main thread
//it uses forkjoinpool
//exceptions can be thr
//CompletableFuture.runAsync(()->System.out.println("hello")).thenApply(fn).thenApplyAsync;
	}
}
