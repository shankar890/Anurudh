package Programming;

import java.util.Scanner;

public class elseIfCondition {

	public static void main(String[] args) {
		int Age;
		System.out.println("Enter your age");
		
		try (Scanner bold = new Scanner (System.in)) {
			{
				Age=bold .nextInt();
			}
		}
		if(Age<45) {
			
		System.out.println("Your age is greater");
		
		}
		else if (Age>35){
			System.out.println("Your age is smaller");
		}
		else
			System.out.println("You are too small");
			
		 {
			
		}
		}
		

	}


