package stream.Lambda;

import java.util.ArrayList;

public class RemoveEven {
public static void main(String[] args) {
	ArrayList<String> name=new ArrayList<String>();
	name.add("ram");
	name.add("rahul");
	name.add("raja");
	
	name.removeIf((n -> (n.length()%2)==0));
	
	for(String str : name) {
		System.out.println(str);
	}
	
	
}
}
