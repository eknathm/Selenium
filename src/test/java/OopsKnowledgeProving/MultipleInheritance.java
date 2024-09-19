package OopsKnowledgeProving;
//Multiple Inheritance in Java is achieved through the Interface
//We can create a object of a class by giving reference of interface it implements.

interface TwoWheeler{
	int wheels = 2;
	int passenger= 2;
	
}

interface FourWheeler{
	int wheels = 4;
	
}

class Vehicle implements TwoWheeler,FourWheeler{
	int speed;
	int wheels;
}

public class MultipleInheritance {
	
	public static void main(String[] args) {
		
		Vehicle vh = new Vehicle();
		vh.wheels = 4; 
		System.out.println(vh.wheels);
		TwoWheeler twr = new Vehicle(); // We can create a object of a class by giving reference of interface it implements.
	}

}
