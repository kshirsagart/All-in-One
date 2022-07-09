package strings;    // 121=121 , madam=madam

public class Palindrom {
//it need lenght charAt and equal
	public static void main(String[] args) {
	
		String ss="madam";
		String rev="";
		int length=ss.length();
		
		for(int i=length-1;i>=0;i--) {
			rev=rev+ss.charAt(i)
			;
		}
		System.out.println(rev);
		
		
		if(ss.equals(rev)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("non palindrom");
		}

	}

}
