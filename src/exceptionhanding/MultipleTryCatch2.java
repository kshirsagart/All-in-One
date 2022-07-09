package exceptionhanding;

public class MultipleTryCatch2 {

	public static void main(String[] args) {
		
		try{
			System.out.println("Try 1");
			
		try {
			System.out.println("Try 2");
			System.out.println(10/0);
		
		try {
			System.out.println("Try 3");
		}catch(Exception e) {
			System.out.println("Catch 3");
		}
		}catch(NumberFormatException e) {
			System.out.println("Catch 2");
		}
		}	catch(Exception e) {
				 System.out.println("Catch 1");	
			 	}
		
		
		
	
		}
	}



