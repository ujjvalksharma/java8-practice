import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Person{
	String name;
	List<Integer> phoneNumbers;
	
	Person(String name,List<Integer> phoneNumbers){
		this.name=name;
		this.phoneNumbers=phoneNumbers;	
	}
	
	
}
public class MapVsFlatMapDemo {

	public static void main(String args[]) {
		
		List<Person> persons=new ArrayList<>();
		
		persons.add(new Person("ujjval",Arrays.asList(123,456)));
		persons.add(new Person("utkarsh",Arrays.asList(12433,452226)));
		
		// map is for one to one mapping
		// one person has one name
		List<String> names=persons.stream().map(person->person.name)
				.collect(Collectors.toList());
		System.out.println(names);
		
		// map doesn't flatten one to many like one person has many phone numbers
		List<List<Integer>> phonenumbers=persons.stream().map(person->person.phoneNumbers)
				.collect(Collectors.toList());
		
		System.out.println(phonenumbers);
		
		// flatmap is for one to many mapping like one person has many phone numbers
		List<Integer> flattenPhoneNumbers=persons.stream().flatMap(person->person.phoneNumbers.stream())
				.collect(Collectors.toList());
		
		System.out.println(flattenPhoneNumbers);
		
	}
}
