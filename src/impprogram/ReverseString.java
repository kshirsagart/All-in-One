package impprogram;

public class ReverseString {

	public static void main(String[] args) {
		
		String ss="Akash";
		String rev=" ";
		int length=ss.length();
		
		
		for(int i=length-1;i>=0;i--) {
			rev=rev+ss.charAt(i);
		}
        System.out.println(rev);
	}

}
