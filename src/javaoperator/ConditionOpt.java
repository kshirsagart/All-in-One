package javaoperator;

public class ConditionOpt {

	public static void main(String[] args) {
	
		
		int a=(10>20)?50:40;   // 40
		System.out.println(a);
		int b=(10<20)?80:100;  //80
		System.out.println(b);
        int c=(10==20)?90:100; //100
        System.out.println(c);
        int d=(10>=5)?40:100;  //40
        System.out.println(d);
        int e=(10!=5)?40:80;   //40
        System.out.println(e);
        int f=(10>5)?40:(5<2)?40:30;  //40
        System.out.println(f);
	}

}
