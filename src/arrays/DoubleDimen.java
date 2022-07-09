package arrays;

public class DoubleDimen {

	public static void main(String[] args) {
		
            int a[][]=new int[3][3]; // rows and columb
            a[0][0]=10;
            a[0][1]=20;
            a[0][2]=30;
            a[1][0]=40;
            a[1][1]=50;
            a[1][2]=60;
            a[2][0]=70;
            a[2][1]=80;
            a[2][2]=90;
            
            for(int i=0;i<3;i++) {
            	for(int j=0;j<3;j++) {
            		
            		  System.out.print(a[i][j]+"  ");
            	}
            }
            System.out.println();
            
            int b[][]= {{10,20,30},{40,50,60},{70,80,90}};
    		
    		System.out.println(b.length);
    		System.out.println(b[0][1]);
    		
    		for(int l=0;l<b.length;l++) {
    			for(int m=0;m<b.length;m++) {
    				System.out.print(b[l][m]+" ");
    			}
    			System.out.println();
    				
    			}
    		}
    		
            
           
            				
            				
	}


