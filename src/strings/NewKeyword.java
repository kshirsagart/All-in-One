package strings;

public class NewKeyword {

	public static void main(String[] args) {
         
		String a=new String("Tushar");
		String b=new String("Tushar");
		
		
		String c=new String("Kshirsagar");
		
		System.out.println(a+c);
		System.out.println(a.concat(c));
		System.out.println("full name"+" "+a+c);
		
		System.out.println(a==b);  // equal operator compare address //false
		System.out.println(a!=b);  //true
		System.out.println(a.equals(b)); //equal method compare content //true
		System.out.println(a.equals(c));  //false
		System.out.println(a.equalsIgnoreCase(b)); //true
		System.out.println(a.equalsIgnoreCase(c)); //false
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.isEmpty());
		System.out.println(a.isBlank());
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c));
		System.out.println(c.compareTo(a));
		System.out.println(a.compareToIgnoreCase(c));
		System.out.println(a.replace("T", "t"));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a.charAt(1));
		System.out.println(a.lastIndexOf(5));
		System.out.println(a.endsWith(a));
		System.out.println(a.endsWith(b));
		System.out.println(a.endsWith(c));
		

	}

}
