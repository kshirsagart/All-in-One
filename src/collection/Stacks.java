package collection;

import java.util.*;
public class Stacks {

	public static void main(String[] args) {
	
		Stack<Integer>list=new Stack<>();

		list.push(10);
		list.push(20);
		list.push(30);
		System.out.println(list);
		
		list.push(50);
		System.out.println(list);
		
		list.pop();
		System.out.println(list);
		
		list.pop();
		System.out.println(list);

		System.out.println(list.get(1));
		
		list.set(0, 50);
		System.out.println(list);
		
		list.add(1,80);
		System.out.println(list);
		
		
		System.out.println(list.size());
		
	
		Collections.sort(list);
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			
		
			System.out.println(list.peek());
		}
	}

}
