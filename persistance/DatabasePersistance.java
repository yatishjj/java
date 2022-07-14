package stream.persistance;

public class DatabasePersistance extends Persistance{
	@Override
	void persist() {
		System.out.println("Data saved in database");
	}
	
	public static void main(String[] args) {
		Persistance p1= new DatabasePersistance(); //upcasting 
		p1.persist();
	}
}
