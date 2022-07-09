package strings;

public class StringLiteral {

	public static void main(String[] args) {
		String a="Tushar123";
		String b="";
		String c="Akash";
		String d="Balu";
		String e="Kshirsagar";
		
	  a.length();
		
		
	/*	System.out.println(a+d+e);
		System.out.println(a.concat(d).concat(e));
		System.out.println("Full name"+"  "+ a+d+e);
		System.out.println(a==b);  // equal compare the addrress
		System.out.println(a.equals(b));  // compare the content
		System.out.println(a.charAt(5));  //position*/
		System.out.println(a.split(e));
		
		
		System.out.println(a.compareTo(b)); //0
		System.out.println(a.compareTo(c)); //+ve
		System.out.println(c.compareTo(b)); //-ve
		System.out.println(a.compareToIgnoreCase(c));
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.equals(c));
		System.out.println(a.equalsIgnoreCase(c));
		
		System.out.println(a.replace('u', 'U'));
		
		System.out.println(a.substring(1, 5));  //between range
		System.out.println(a.substring(1));  // except value
		
		System.out.println(b.isEmpty());
		System.out.println(b.isBlank());
		System.out.println(a.trim());
		
		System.out.println(a.length());
		System.out.println(b.length());
		System.out.println(c.length());
		
		
		

	}

}
