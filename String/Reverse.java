package stream.String;

public class Reverse {
	public static void main(String[] args) {
		
	
	StringBuffer buffer1 = new StringBuffer("This method return the reversed object on which it was called");
	
	System.out.println("Original String :"+buffer1);
	
	buffer1.reverse();
	
	System.out.println("Reversed String :"+buffer1);
}

}
