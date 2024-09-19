package OopsKnowledgeProving;

class Parent{
	String name;
	int age;
	String Surname;
	String Nationality;
	
	Integer sum(int a, int b){
		return a + b;
	}
}

class Child extends Parent{
	
	String name;
	int age;
}

public class Inheritance {
	
	public static void main(String[] args) {
		
	Child chd = new Child();
	chd.Surname = "Marathe";
	chd.name = "Eknath";
	chd.sum(10, 20);
	System.out.println(chd.Surname);
	System.out.println(chd.sum(10, 20));	
	}
}
