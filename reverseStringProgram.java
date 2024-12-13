package Programming;

import java.util.Scanner;

public class reverseStringProgram {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the String value");

			String input=scanner.nextLine();

			String reveresed="";

			for(int i=input.length()-1;i>=0;i--)
			{
				reveresed=reveresed + input.charAt(i);


			}
			System.out.println("Reversed String value:"+ " " + reveresed);
		}
	}


}
