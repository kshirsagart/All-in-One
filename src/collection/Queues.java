package collection;

import java.util.*;
public class Queues {

	public static void main(String[] args) {
		
		Queue<Integer>list=new LinkedList<Integer>();
		
	list.add(10);
	list.add(20);
	list.add(30);

	System.out.println(list.size());
	

	
	
	System.out.println(list);
	list.add(80);
	System.out.println(list);
	list.remove();
	System.out.println(list);
	
	list.poll();                       //
	System.out.println(list);  //remove first element
	

	list.add(80);
	list.add(90);
	list.add(100);
	System.out.println(list);
	
	
	System.out.println(list.peek()); 
	
	
	
	
/*	System.out.println(list.poll());  //give  the first value
	System.out.println(list.peek());  // give the middle value
	
*/
	
	
	
	
	
	
		
		
		
		

	}

}
