package OopsKnowledgeProving;
//If Parent class method is redefined in subclass then it is method overriding.
//Note: Methods should have same name and same number of arguments but defined in different classes.

class PetAnimal{
	int legs;
	int horns;
	String diet;
	void AnimalType(){
		System.out.println("This is a Pet Animal");
	}
}

class Dog extends PetAnimal{
	int legs = 4;
	int horns = 0;
	String diet = "Carnivore";
	
	void AnimalType(){
		System.out.println("This is a Dog");
	}
}

public class PolymorphismMethodOverriding {
	
	public static void main(String[] args) {
		
	PetAnimal pa = new PetAnimal();
	pa.AnimalType();
	Dog dg = new Dog();
	dg.AnimalType();
	
	}

}
