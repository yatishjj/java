package stream.persistance;

public class FilePersistance extends Persistance {
	@Override
	void persist() {
	System.out.println("Data is saved in file");	
	}

	public static void main(String[] args) {		
		Persistance p1= new FilePersistance(); //upcasting 
		p1.persist();
	}

}
