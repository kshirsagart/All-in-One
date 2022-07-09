package wrapperclasse;

public class Autoboxing {

	public static void main(String[] args) {
		
		int a=20;
		Integer b=new Integer(a);
		Integer c=b;
		Integer d=b.intValue();
		
		char cc='a';
		Character dd=new Character(cc);
		Character ee=dd;
		Character ff=dd.charValue();
		
		byte aa=10;
		Byte bb=new Byte(aa);
		Byte ab=aa;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		System.out.println(cc);
		System.out.println(dd);
		System.out.println(ee);
		System.out.println(ff);
		
	
		
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(ab);
	}

}
