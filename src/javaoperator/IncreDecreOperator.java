package javaoperator;

public class IncreDecreOperator {

	public static void main(String[] args) {
		 int i=10;
		 int j=12;
		//post increment 
		 System.out.println(i++);  // 10(10+1)
 		 System.out.println(i++);  //11(11+1)
         System.out.println(j++); //12(12+1)
         System.out.println(j++); // 13(13+1)
         System.out.println(i); //12
         System.out.println(j); //14
         
         
         //pre increment
         System.out.println(++i); //13
         System.out.println(++j); //15
         System.out.println(i);  //13
         System.out.println(j);  //15
         
         
         //post decrement
         System.out.println(i--);  //13(13-1)
         System.out.println(j--);  //15(15-1)
         System.out.println(i);    //12
         System.out.println(j);   // 14
         
         //pre decrement
         System.out.println(--i);  //11
         System.out.println(--j);  //13
         System.out.println(i);    //11 
         System.out.println(j);    //13
         
         i++;   // 11(11+1)
         System.out.println(i);
         
         --i;
         System.out.println(i); //11
         
         System.out.println(i++ + j++ + ++i + ++j + j-- + i-- + i + j);
         //11+13+13+15+13+15+12+14
	}

}
