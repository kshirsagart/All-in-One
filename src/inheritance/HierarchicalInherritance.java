package inheritance;

class AA{
	int a=10;
	void show() {
		System.out.println(a);
	}
}	
class BB extends AA{
	int b=10;
void money() {
	System.out.println(a+b);
}
}
class CC extends AA{
	int c=10;
	void bank() {
		System.out.println(a+c);
	}
}

public class HierarchicalInherritance {

	public static void main(String[] args) {
		
		
		
		CC a=new CC();
		a.bank();
		a.show();
		
		BB b=new BB();
		b.money();
		b.show();

	}

}







