import java.util.*;
import java.util.Map.Entry;

public class SortHashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map=new HashMap<String,Integer>();
		
	
		List<Entry<String, Integer>> listOfItem=new ArrayList<>(map.entrySet());
		
		listOfItem.stream().sorted((entry1,entry2)->
		entry1.getKey().compareTo(entry2.getKey()));
		
		
	}
}
