package stream.String;

public class StringBuilder2 {
	public static void main(String[] args) {
		
	
	StringBuilder builder = new StringBuilder("it is used to at the specified index posotion");
	
	System.out.println("Original String :"+builder);
	
	builder.insert(13," insert text");
	
	System.out.println("After Inserting text :"+builder);
	
}
}