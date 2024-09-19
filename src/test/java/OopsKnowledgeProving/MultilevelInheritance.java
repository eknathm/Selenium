package OopsKnowledgeProving;

class Grandfather{
	String Surname;
	
}

class Father extends Grandfather{
	int Age;
	
}

class Son extends Father{
	
	int name;
	
}
public class MultilevelInheritance {
	
	public static void main(String[] args) {
		
		Son sn = new Son();
		sn.Surname = "Marathe";
		System.out.println(sn.Surname);
		
	}

}
