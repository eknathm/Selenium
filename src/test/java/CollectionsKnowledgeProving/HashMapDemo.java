package CollectionsKnowledgeProving;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Values are stored in Key value format
		//Indexing is not possible in Set
		//HashMap implements Map interface
		
		//HashMap hm = new HashMap();
		//Map hm = new HashMap();
		
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(101,"Eknath");
		hm.put(102,"Anand");
		hm.put(103,"Swapnil");
		hm.put(104,"Raj");
		hm.put(101,"Ravi");
		
		System.out.println(hm);
		
		//enhanced for loop
		for( Object x : hm.entrySet()) {
			
			System.out.println(x);
		}
		
		//Iterator entry set
		
		Iterator<Entry<Integer,String>> it = hm.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Iterator key set
		Iterator<Integer> it1 = hm.keySet().iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		//Iterator Values
		
		Iterator<String> it2 = hm.values().iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
	}

}
