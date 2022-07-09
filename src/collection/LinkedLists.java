package collection;

import java.util.*;
public class LinkedLists {

	public static void main(String[] args) {
		
		LinkedList<String>name=new LinkedList<>();
		
		name.add("Akash");
		name.add("vishal");
		name.add("amol");
		System.out.println(name);
		
		name.add("ravi");
		System.out.println(name);
		
		name.addFirst("malu");
		System.out.println(name);
		
		name.addLast("kalu");
		System.out.println(name);
		
		name.removeFirst();
		System.out.println(name);
		
		name.removeLast();
		System.out.println(name);
		
		System.out.println(name.get(2));
		
		name.add(2,"Malu");
		System.out.println(name);
		
		System.out.println(name.size());
		
	    name.set(1, "bisla");
	    System.out.println(name);
	    
	    Collections.sort(name);
	    System.out.println(name);
	    
	    for(int i=0;i<name.size();i++) {
	    	System.out.println(name.get(i));
	    	
	    	System.out.println(name.getFirst());
	    	System.out.println(name.getLast());
	    }
		
		
		

	}

}
