package interfacee;

interface Parent{
	int a=10,b=5;
	void input();
}

interface Chield extends Parent{
	
	int j=10,k=20;
	void output();
	
}

class AA implements Parent,Chield{

	@Override
	public void output() {
		System.out.println(j+k);
		
	}

	@Override
	public void input() {
		System.out.println(a-b);
		
	}
	
}

public interface MultipleInheritance {
	
	public static void main(String[] args) {
		
	

	AA a=new AA();
	a.input();
	a.output();
	
	Chield b=new AA();
	b.input();
	b.output();
	
	
	
	}
}
