package Programming;

import java.util.Scanner;

public class Onlyuppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);

String s= sc.next();

for(int i=0;i<s.length();i++)
{
	char c=s.charAt(i);
	{
	if(Character.isUpperCase(c))
	System.out.print(c);
}

	}

}}
