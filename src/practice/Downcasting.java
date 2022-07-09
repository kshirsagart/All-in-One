package practice;

class ABC{
	int a=20,b=100;
	void money() {
		System.out.println(a*b);
	}
	
}
class BAC extends ABC{
	int i=80,j=30;
	void copy() {
		System.out.println(i*j);
	}
}
public class Downcasting {

	public static void main(String[] args) {
		ABC obj=new BAC();  // upcasting by implicitily
		obj.money();
		
	//	BAC obj1=new ABC();  // down casting by implicitly does not possible 
		                          // it gives compile time error
		BAC obj1=(BAC)obj;   // down casting by explicitly
		obj1.money();
		obj1.copy();
	
		
		

	}

}








