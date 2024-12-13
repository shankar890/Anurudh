package Programming;

class MyTestProgram{
	private int id;
	private String name;
	//below is the constructor created and it get called during the execution of the program and it has same name as class name
	
//	public MyTestProgram() {
//	 id =45;
//	  name= "Raja";
	  
	  public MyTestProgram(String TextName , int MyID ) {
			id = MyID;
			  name= TextName;
			 
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
	
	public void setid(int i) {
		id =i;
	}
	public int getID(){
		return id;
	}
				
	}

public class MyConstructer {

	public static void main(String[] args) {
//		MyTestProgram Raja= new MyTestProgram();
//System.out.println(Raja.getID());
//System.out.println(Raja.getName());
		
		MyTestProgram Raja= new MyTestProgram("GoodBoy", 45);
		System.out.println(Raja.getID());
		System.out.println(Raja.getName());
	}
	

}
