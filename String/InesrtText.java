package stream.String;

public class InesrtText {

	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("it is used to at the specified index posotion");
		
		System.out.println("Original String :"+buffer);
		
		buffer.insert(13," insert text");
		
		System.out.println("After Inserting text :"+buffer);
		
	}
}
