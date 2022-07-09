package practice;

public class StringLiterals {

	public static void main(String[] args) {
		
		String a="Akash";
		String b="Vishal";
		
		System.out.println(a.concat(b));
		System.out.println(a+b);
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a==b);
		System.out.println(a.length());
		System.out.println(a.equals(b));
		System.out.println(a.compareTo(b));
		System.out.println(a.isEmpty());
		System.out.println(a.isBlank());
        System.out.println(a.replace("A", "a"));
        System.out.println(a.charAt(4));
        System.out.println(b.contains("s"));
        System.out.println(b.endsWith("al"));
        System.out.println(b.startsWith("vi"));
        System.out.println(b.indexOf("s"));
        System.out.println(b.lastIndexOf("a"));
        System.out.println(b.indexOf(2));
	}

}
