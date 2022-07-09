package practice;

public class Parametrisedmethod {
	
	void money(int i,int j) {     // parametrised method
		System.out.println(i+j);  // 
	}

	void bank() {             // non paremetrised method
		int a=20,b=10;
		System.out.println(a+b);
	}



	public static void main(String[] args) {
		
		Parametrisedmethod obj=new Parametrisedmethod();
		
		obj.money(10, 20);
	    
		obj.bank();


}}