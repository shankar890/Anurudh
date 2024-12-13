package Programming;

public class StringMethodsPractice {

	public static void main(String[] args) {
		
		String name ="TestStringvalue";
		System.out.println(name);
		// String are immutable hence can be reassigned to other variable to convert 
		String tocheck =name.toUpperCase();
				System.out.println(tocheck);
				//to return the string value from index 4
				//System.out.println(name.substring(7));
				System.out.println(name.charAt(4));
				//to check if string end with specified value or not 
				System.out.println(name.endsWith("u"));

	}

}
