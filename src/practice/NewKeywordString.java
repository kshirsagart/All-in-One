package practice;

public class NewKeywordString {

	public static void main(String[] args) {
		
		String ss=new String("Akash");
		String ss1=new String("Vishal");
		
		String a="Akash";
		String b="Akash";
		System.out.println(a==b);
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(ss.concat(ss1));
		System.out.println(ss+ss1);
		System.out.println(ss.charAt(0));
		System.out.println(ss.length());
		System.out.println(ss.toLowerCase());
		System.out.println(ss1.toUpperCase());
		System.out.println(ss.toCharArray());
		System.out.println(ss==ss1);
		System.out.println(ss.equals(ss1));
		System.out.println(ss.compareTo(ss1));
		System.out.println(ss.compareToIgnoreCase(ss1));
		System.out.println(ss.isBlank());
		System.out.println(ss.isBlank());
		System.out.println(ss.hashCode());
		System.out.println(ss1.hashCode());
		System.out.println();

	}

}
