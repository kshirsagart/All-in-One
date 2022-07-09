package javaoperator;

public class StringConcatOpt {

	public static void main(String[] args) {
		
		int a=20;
		int b=10;
		
		System.out.println(a+b);
		System.out.println("concate" +"   " +a+b);
		
		String ss="tushar";
		String ss1="kshirsagar";
		
		System.out.println("full name"+"  "+ss+ss1);
		System.out.println("Full name"+" " +ss.concat(ss1));
        System.out.println(ss+ss1);
	}

}
