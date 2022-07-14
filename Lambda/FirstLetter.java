package stream.Lambda;

import java.util.Arrays;


public class FirstLetter {
public static void main(String[] args) {
	StringBuilder result=new StringBuilder();

	Arrays.asList("yatish", "rahul", "nitin")

.forEach(word -> result.append(word.charAt(0)));
System.out.println(result);

}
}
