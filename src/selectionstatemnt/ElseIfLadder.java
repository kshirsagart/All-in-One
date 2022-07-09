package selectionstatemnt;

public class ElseIfLadder {

	public static void main(String[] args) {
             
		int mark=80;
		
		if(mark>=80) {
			System.out.println("Topper");
		}
		else if(mark<80 && mark>=60) {
			System.out.println("First");
		}
		
		else {
			System.out.println("Second");
			
		}
	}

}
