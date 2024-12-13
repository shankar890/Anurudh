package Programming;

public class Array {

	public static void main(String[] args) {
//Array is collection of similar types of data and only allocated element can be accessed
//    int [] marks = new int [5];
		int [] marks = {1,4,45,7581}; //Declaration and initialization on same line 
    
//    marks[0]=45;
//    marks[1]=42;
//    marks[2]=25;
//    marks[3]=40;
//    marks[4]=01;
		//Increasing order printing arrays
		for(int i=0; i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
//    
		//In reverse order printing arrays 
		for(int i=marks.length-1; i>=0;i--)
		{
			System.out.println(marks[i]);
		}
//    System.out.println(marks[3]);
//    System.out.println(marks.length);
    
    
    

	
	}
}
