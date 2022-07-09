package exceptionhanding;

public class MultipleTryCatch3 {

	public static void main(String[] args) {
		try {
			int a[]=new int[-1];
			System.out.println("Akash");
			try {
				System.out.println("Try 2");
			try {
				System.out.println("Try 3");
			
			}catch(Exception e) {
				System.out.println("Catch 3");
			}	
		}catch(Exception e) {
			System.out.println("Catch 2");
		}	
	
				
				
			}catch(Exception e) {
				System.out.println("catch 1");
			}
				
				
				
				
		
				
				
				
				
			
			
			
		

	}

}
