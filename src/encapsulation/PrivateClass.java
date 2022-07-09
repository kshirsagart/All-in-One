package encapsulation;

class Parent{
	
	private int A=10;
	private int B=20;
	private int C;
	private int D;
   public int getA() {
	   return A;
   }
   
   public void setA(int a) {
	   this.A=A;
   }
	
	public int getB() {
		return B;
	}
	public void setB(int b) {
		this.B = B;
	}
	public int getC() {
		return C;
	}
	public void setC(int C) {
		this.C = C;
	}
	public int getD() {
		return D;
	}
	public void setD(int D) {
		this.D = D;
	}
	
}



public class PrivateClass {

	public static void main(String[] args) {
		
		Parent a=new Parent();
		a.setC(100);
		a.setD(50);
		System.out.println(a.getA());
		System.out.println(a.getB());
		System.out.println(a.getC());
		System.out.println(a.getD());
		
		System.out.println(a instanceof Parent);
		

	}

}
