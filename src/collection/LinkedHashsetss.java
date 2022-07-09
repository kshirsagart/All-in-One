package collection;

import java.util.*;
public class LinkedHashsetss {

	public static void main(String[] args) {
		
		Set aa=new LinkedHashSet();
		
		aa.add(1);
		aa.add(10);
		aa.add("Akash");
		aa.add(null);
		aa.add(null);
		
		System.out.println(aa);
		System.out.println(aa.size());
		
		aa.remove("Akash");
		System.out.println(aa);
		
		System.out.println(aa.equals(aa));
		
		

	}

}
