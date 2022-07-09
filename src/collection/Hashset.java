package collection;

import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		
		Set s=new HashSet();
		
		s.add("Vikas");
		s.add("Koshika");
		s.add(10001);
		s.add('A');
	
		s.add(null);
		s.add(null);
	
		System.out.println(s.size());
		System.out.println(s);
        
		s.remove(5);
		System.out.println(s);
		
		System.out.println(s.getClass());
		
		System.out.println(s.hashCode());
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.contains("Vikas"));
		
	
		
		





	}

}
