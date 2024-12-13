package Programming;



class Testercode{
	private int id;
	private String name;
	
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
	

public class gettersetter {

	public static void main(String[] args) {
		
		Testercode instrument = new Testercode();
	
//			instrument.id=45;
//			instrument.name="Anuru";
	//Getter and setter is used for the data hiding concept 
		instrument.setid(4);
		System.out.println(instrument.getID());
		instrument.setName("Ram");
		System.out.println(instrument.getName());
	}
	}



