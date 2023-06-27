package SuperExample;

class Kiwi{
	Kiwi(){
		System.out.println("Kiwi");
	}
	Kiwi(String k){
		System.out.println("Kiwi "+k);
	}
}
public class Fruit extends Kiwi {

	Fruit(){
		//super(" called");
		System.out.println("Fruit");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f=new Fruit();

	}

}
