package strings;

public class New {

	public static void main(String[] args) {
	   String  a="Akash";
	   String b="akash";
	   String c="Ravi";
	   
	   int length=a.length();
	   String rev="";
	   
	   System.out.println(a.equals(b)); //false
	   System.out.println(a.equalsIgnoreCase(b)); // true  it ignore the upper and lower case
       System.out.println(a.equals(c));   //false
       System.out.println(a.equalsIgnoreCase(c));  //false
       
       
       
       System.out.println(a.compareTo(b));  // -32           a<b
       System.out.println(a.compareToIgnoreCase(b)); //0     a==b
       System.out.println(b.compareTo(c));  //+15            a>b
       
       
       for(int i=length-1;i>=0;i--) {
    	   rev=rev+a.charAt(i);
       }
       System.out.println(rev);
       
       if(a.equals(rev)){
    	   System.out.println("palindrom");
       }
       else {
    	   System.out.println("non palindrom");
       }
	}

}
