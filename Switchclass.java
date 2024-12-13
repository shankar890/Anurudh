package Programming;

import java.util.Scanner;

public class Switchclass {

	public static void main(String[] args) {
		
	int age;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age");
		age=sc.nextInt();
		//Switch case is used to select a specific value from an alternative given values 
		switch(age) {
		case 1:
		System.out.print("hellow age is 9");
		//Break is use to terminate the other remaining case when its matches with any case 
		break;
		
		case 8:
			System.out.print("hellow age is 7");
	
	break;
	 default:
		 System.out.print("hellow age is 4");
		 
		}
	}
}
		 
		
		 
			
	
	
	
		
		
			
		
