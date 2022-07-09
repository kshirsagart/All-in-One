package exceptionhanding;

public class TryCatch2 {

	public static void main(String[] args) {
		
		String ss="akash";
		try {
		int a=Integer.parseInt(ss);
		System.out.println(a);
		}
		catch(NumberFormatException e) {
			System.out.println("String can not convert to number");
		}
		
		String ss1="123";
		try {
		int a=Integer.parseInt(ss1);
		System.out.println(a);
		}
		catch(NumberFormatException e) {
			System.out.println("String can not convert to number");
		}
	}
	}


