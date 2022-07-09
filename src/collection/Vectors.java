package collection;

import java.util.*;
public class Vectors {

	public static void main(String[] args) {
		
		Vector<String>name=new Vector<>();
		
		name.add("amol");
		name.add("akash");
		name.add("kalu");
		
		System.out.println(name);
		
		
		name.add("balu");
		System.out.println(name);
		
		name.set(0, "dhiraj");
		System.out.println(name);
		
	   System.out.println(name.get(1));
	   
	   name.add(1,"manu");
	   System.out.println(name);
	   
	   System.out.println(name.size());
	   
	   Collections.sort(name);
	   System.out.println(name);
	   
	   for(String ss:name) {
		   System.out.println(ss);
	   }

	}

}
