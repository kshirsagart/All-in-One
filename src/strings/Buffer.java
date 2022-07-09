package strings;

public class Buffer {

	public static void main(String[] args) {
		
		StringBuffer a=new StringBuffer("  Hello java  ");
		StringBuffer b=new StringBuffer("A");
		b.append("B").append("c");
		System.out.println(b.length());
		System.out.println(b.capacity()+""+b);
		System.out.println(b.replace(1, 3, "Hello"));
		
		
		System.out.println(a.reverse()); //reverse value
		System.out.println(a.capacity());
		System.out.println(a.charAt(3));
		System.out.println(a.equals(a));
		System.out.println(a.isEmpty());
		System.out.println(a.length());
		
		
		StringBuffer c=new StringBuffer();
		System.out.println(b.capacity());
		

	}

}
