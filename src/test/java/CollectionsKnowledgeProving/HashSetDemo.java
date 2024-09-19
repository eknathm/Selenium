package CollectionsKnowledgeProving;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Heterogeneous data can be stored
		//Duplicates are not allowed in hashset
		//Multiple 'null' are not allowed
		//Index is not valid for set
		//HashSet implements Set interface
		// To get value from set is not possible directly but we can convert set to ArrayList.
		//Pass set object to ArrayList and fetch value using ArrayList.
		
		//HashSet hs = new HashSet();
		//Set hs = new HashSet();
		
		
		HashSet<Object> hs = new HashSet<>();
		
		hs.add("Welcome");
		hs.add(5);
		hs.add(true);
		hs.add(5);
		System.out.println(hs);
		hs.remove(5);
		System.out.println(hs);
		
		//enhanced for loop
		
		for(Object x : hs) {
			System.out.println(x);
		}
		
		//iterator
		
		Iterator<Object> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
