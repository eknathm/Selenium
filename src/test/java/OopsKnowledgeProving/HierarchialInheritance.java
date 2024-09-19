package OopsKnowledgeProving;

class Pet{
	int legs;
	
}

class Horse extends Pet{
	int speed;
	
}

class Cow extends Pet{
	int speed;
}

public class HierarchialInheritance {
	
	public static void main(String[] args) {
		
		Cow cw = new Cow();
		cw.legs = 4;
		Horse hs = new Horse();
		hs.legs = 4;
		
		System.out.println(cw.legs);
		System.out.println(hs.legs);
		
	}

}
