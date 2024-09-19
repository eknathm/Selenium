package CollectionsKnowledgeProving;
//ArrayList is a class which implements list interface
//ArrayList contains Non-Primitive data types i.e. wrapper classes.

import java.util.ArrayList;
//import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration
		//ArrayList mylist1 = new ArrayList(); //Creating object of ArrayList class. This is generic ArrayList and can contain Heterogeneous data
		//List mylist2 = new ArrayList();     //By giving reference of List interface.
		//ArrayList<Integer> list = new ArrayList<Integer>(); //Integer ArrayList for Homogeneous data
		//We can pass 'Object' class as argument to the ArrayList if we want to store Heterogeneous data
		//ArrayList allows duplicates.
		//ArrayList allows multiple 'null' values.
		//Insertion order is preserved
		//Can store Heterogeneous data
		
		ArrayList<Object> list = new ArrayList<>();
		list.add(9);
		list.add(7);
		list.addLast("Welcome");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);	
	}

}
