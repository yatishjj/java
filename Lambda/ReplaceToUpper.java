package stream.Lambda;

import java.util.ArrayList;

public class ReplaceToUpper {
public static void main(String[] args) {
	ArrayList<String> name=new ArrayList<String>();
	name.add("rahul");
	name.add("nitin");
	name.add("shukla");
	name.add("yatish");
	name.replaceAll(e -> e.toUpperCase());
	System.out.println(name);
	
}
}
