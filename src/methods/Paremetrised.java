package methods;

public class Paremetrised {

	void main(int i) {
		System.out.println("akash");
		System.out.println(i);
	}
	
	
	static void money(int j) {
		System.out.println("tushar");
		System.out.println(j);
	}
	
	public static void main(String[] args) {
           
		Paremetrised a=new Paremetrised();
         
		a.main(100);
		money(50);
	}

}
