package collection;

import java.util.*;

 class ListAraay {

	public static void main(String[] args) {
	
		ArrayList<Integer>list=new ArrayList<>();
		
		//Add element
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
	
		//get element
	
		System.out.println(list.get(1));
        
		// add in between
		list.add(1, 5);
		System.out.println(list);
		
		//remove
		list.remove(1);
		System.out.println(list);
		
		//set element
		list.set(0, 10);
		System.out.println(list);
		
		//size
		
		System.out.println(list.size());
		
		//loop
		for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i));
	}
		System.out.println();
		
		Collections.sort(list);
		System.out.println(list);
	}
	
	
 }
