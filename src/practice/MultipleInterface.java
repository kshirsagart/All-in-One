package practice;

interface AAA{
	int a=20,b=30;
	void input();
	void output();
}
interface BBB{
	int i=100,j=30;
	void cash();
	void money();
}

class CCC implements AAA,BBB{

	@Override
	public void cash() {
		System.out.println(a+b);
		
	}

	@Override
	public void money() {
		System.out.println(a-b);
		
	}

	@Override
	public void input() {
		System.out.println(i+j);
		
	}

	@Override
	public void output() {
		System.out.println(i-j);
	}		
	}
public class MultipleInterface {

	public static void main(String[] args) {
		CCC obj=new CCC();
		obj.cash();
		obj.money();
		obj.input();
		obj.output();

	}

}
	


