package impprogram;

import java.util.Scanner;

public class CountNumberofSpacesString {

	public static void main(String[] args) {
		
		String n;
		System.out.println("Enter Number Of String");
		Scanner ab=new Scanner(System.in);
		n=ab.nextLine();
		
		char ch[]=n.toCharArray();
		int letters=0,spaces=0,numbers=0,others=0;
		
		for(int i=0;i<n.length();i++) {
			if(Character.isLetter(ch[i]))
					{  letters++;
					}
			else if(Character.isSpace(ch[i])) {
				spaces++;
			}
				else if(Character.isDigit(ch[i])) {
				numbers++;	
				}
				else {
					others++;
				}
			System.out.println(n);
			System.out.println("letters" +" "+ letters);
			System.out.println("spaces" + "  "+spaces);
			System.out.println("numbers"+ "  "+numbers);
			System.out.println("others"+"  "+others);
				
				
			}
		}

	}


