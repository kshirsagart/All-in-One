package interfacee;

interface ABC{
	
	int a=10,b=20;
	void input();
	void output();
}
class BAC implements ABC{

	@Override
	public void input() {
		System.out.println(a+b);
		
	}

	@Override
	public void output() {
		System.out.println(a-b);
		
	}
	
}

public class SingleInterface {

	public static void main(String[] args) {
		BAC a=new BAC();
		a.input();
		a.output();

	}

}



