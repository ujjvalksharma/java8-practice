import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;



public class OptionalDemo {
	
	

	public static void main(String[] args) {
		
	List<Person> persons=new ArrayList<>();
	persons.add(new Person("ujjval",Arrays.asList(123,456)));
	persons.add(new Person("utkarsh",Arrays.asList(12433,452226)));
	
	
	   Optional<Object> emptyOptional = Optional.empty();
       System.out.println(emptyOptional);
       //  Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
       Optional<String> emailOptional=Optional.ofNullable(persons.get(0).name);
       String tempEmail=emailOptional.get();
       System.out.println(emailOptional);
       System.out.println(tempEmail);
       
   	persons.add(new Person(null,Arrays.asList(123,456)));
   	// inserting null in Optional.ofNullable
   	
    Optional<String> emailOptional1=Optional.ofNullable(persons.get(2).name);
  //   tempEmail=emailOptional1.get(); // Optional.empty().get() --> NoSuchElementException
    //System.out.println(emailOptional1);
   // System.out.println(tempEmail);
    
    // null with optional.of
    //Optional.of-->java.lang.NullPointerException
    Optional<String> emailOptional2=Optional.of(persons.get(2).name);
    // emailOptional2.orElse
   String emailOptional3=emailOptional2.orElse("defaultName");
    
	}
	
}
