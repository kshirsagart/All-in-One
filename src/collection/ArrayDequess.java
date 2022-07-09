package collection;

import java.util.*;
public class ArrayDequess {

	public static void main(String[] args) {
	
		Deque   ss=new ArrayDeque();
		ss.add(" amol");
		ss.add(1);
		ss.add("akash");
		ss.add(10);
		ss.add("ch");
		ss.add(1);
		ss.add("akash");
		ss.add(10);
		ss.add("ch");
		
		
		ss.addFirst("cash");
		System.out.println(ss);
		
		ss.poll();
		System.out.println(ss);
		
		System.out.println(ss.peekFirst());
		
		ss.poll();
		System.out.println(ss);
		
		System.out.println(ss);
		ss.remove();
		System.out.println(ss);
		
		ss.poll();                //FIFO
		System.out.println(ss);
		
		ss.pollFirst();
		System.out.println(ss);
		
		ss.pollLast();
		System.out.println(ss);
		
		
		System.out.println(ss.peek());
		System.out.println(ss);
		
		System.out.println(ss.peekLast());
		
		
		
		
		

	}

}
