import java.util.HashSet;
import java.util.Set;

public class Setsample {
	public static void main(String[] args){
		Set<String> set= new HashSet<String>();
		set.add("value1");
		set.add("value2");
		set.add("value3");
		set.add("value4");
		set.add("value5");

		 for(String s:set){
			 System.out.println(s);
		 }


	}

}

