package SuperExample;

class Vehicle{
	int x=0;
	Vehicle(){
		System.out.println("Vehicle");
		
	}
	
	Vehicle(String v){
		System.out.println(" vehicle "+v);
	}
}
public class Bike extends Vehicle {
	int x=1;
	Bike(){
		System.out.println(super.x);
		System.out.println("Bike");
	}
	
	Bike(String b){
		System.out.println("Bike "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike=new Bike();
		System.out.println(bike.x);

	}

}
