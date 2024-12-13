package Programming;

public class ProgramOnArray {

	public static void main(String[] args) {
		int[] marks = {4,5,8,9,3};
		
		 int num=5;
		 
		 boolean isInArray=false;
		 
		 for(int elements:marks) 
		 {
			if(num == elements) {
		 
			
			 isInArray=true;
			 break;
			} 
	}
		 if(isInArray){
		  
			 System.out.println("The element is in array");
			 }
		 else
		 { System.out.println("The element is not in array");
	}
}
}
		 
	

		 