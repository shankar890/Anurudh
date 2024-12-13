package Programming;

import java.util.Scanner;

public class Individualcharprint {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
String s=sc.next();

	for(int i=0;i<s.length();i++)
	{
		char C1 =s.charAt(i);
		//to print single char
		//System.out.println(C1);
		
	//to print character Ascii value 
		System.out.println(C1+" "+(int)C1);
		
	}



	}

}
