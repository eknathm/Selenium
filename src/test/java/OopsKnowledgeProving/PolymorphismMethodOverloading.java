package OopsKnowledgeProving;
//Methods with same name but different arguments in same class.
//These methods can be called by creating object of that class and providing the arguments.
//Methods can be called from main method by creating object of that class.

class ArithmaticOperations{
	Integer sum(int a,int b) {
		
		return a + b;
		}
    Integer sum(int a,int b,int c) {
		
		return a + b;
		}
	}

public class PolymorphismMethodOverloading {

	public static void main(String[] args) {
		
		ArithmaticOperations obj = new ArithmaticOperations();
		obj.sum(3,2);
		System.out.println(obj.sum(3,2));
		System.out.println(obj.sum(3,2,5));
	}
	
}
