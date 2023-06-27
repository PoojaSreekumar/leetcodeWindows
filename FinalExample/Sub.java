package FinalExample;
/*
final class Super {
	   private int data = 30;
	}
	public class Sub extends Super{
	   public static void main(String args[]){
	   }
	}
*/

 class Super {
	  final  int data = 30;
	  public final void print() {
		  
	  }
	}
	public class Sub extends Super{
	/*	public void print() {
			
		}
		*/
		
	   public static void main(String args[]){
		   Sub sb=new Sub();
		   System.out.println(sb.data);
	   }
	}