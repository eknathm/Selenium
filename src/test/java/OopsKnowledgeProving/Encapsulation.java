package OopsKnowledgeProving;

class Sample{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String a) {
		this.name = a;
	}
	
	public Integer getAge() {
		return age;
	}
}

public class Encapsulation {
	
	public static void main(String[] args) {
		
		Sample obj1 = new Sample();
		obj1.setName("Eknath");
		obj1.getName();
		System.out.println(obj1.getName());
		
	}

}
