package strings;

public class ReverseString {

	//it required length and charAt
	public static void main(String[] args) {
		String name="Tushar"; // length=6 ,
		
		String rev="";
		int length=name.length();
		
		
		for(int i=length-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			
		}
		
		System.out.println(rev);
		
		
		String name1="madam";
		String reverse="";
		int leng=name1.length();
		
		for(int j=leng-1;j>=0;j--) {
			reverse=reverse+ name1.charAt(j);
		}
		System.out.println(reverse);
		
		if(name1.equals(reverse)) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("non palindrom");
		}
		
		String aa="akash";
		char ch[]=aa.toCharArray();
		System.out.print(ch);
		
		System.out.println(String.copyValueOf(ch));
		System.out.println(String.join(";",name, name1));
		
	}
	}
		