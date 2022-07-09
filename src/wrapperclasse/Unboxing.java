package wrapperclasse;

public class Unboxing {

	public static void main(String[] args) {
		
		Integer a=new Integer(100);
		int b=a;
		int c=a.intValue();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		Boolean aa=new Boolean(false);
		boolean bb=aa;
		boolean cc=aa.booleanValue();
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		
		
		Character ab=new Character('a');
		char bc=ab;
		char cd=ab.charValue();
		System.out.println(ab);
		System.out.println(bc);
		System.out.println(cd);

	}

}
