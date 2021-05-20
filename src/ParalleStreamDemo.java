import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*class Person{
	String name;
	List<Integer> phoneNumbers;
	
	Person(String name,List<Integer> phoneNumbers){
		this.name=name;
		this.phoneNumbers=phoneNumbers;	
	}
	
	
}*/
public class ParalleStreamDemo {

	public static void main(String args[]) {
		  long start=0;
	        long end=0;
	        
	        List<Person> persons=new ArrayList<>();
	    	persons.add(new Person("ujjval",Arrays.asList(123,456)));
	    	persons.add(new Person("utkarsh",Arrays.asList(12433,452226)));

	        start=System.currentTimeMillis();
	        IntStream.range(1,100).forEach(System.out::println);
	        end=System.currentTimeMillis();
	        System.out.println("Plain stream took time : "+(end-start));

	       System.out.println("============================================");

	       start=System.currentTimeMillis();
	       IntStream.range(1,100).parallel().forEach(System.out::println);
	        end=System.currentTimeMillis();
	        System.out.println("Parallel stream took time : "+(end-start));



	        IntStream.range(1,10).forEach(x->{
	            System.out.println("Thread : "+Thread.currentThread().getName()+" : "+x);
	        });

	        IntStream.range(1,10).parallel().forEach(x->{
	            System.out.println("Thread : "+Thread.currentThread().getName()+" : "+x);
	        });
	        
	        

	        //normal
	        start=System.currentTimeMillis();
	        double salaryWithStream = persons.stream()
	                .flatMap(person->person.phoneNumbers.stream())
	                .mapToDouble(i -> i).average().getAsDouble();
	        end=System.currentTimeMillis();

	        System.out.println("Normal stream execution time : "+(end-start)+" : Avg salary : "+salaryWithStream);

	        start=System.currentTimeMillis();
	        double salaryWithParallelStream = persons.parallelStream()
	        		 .flatMap(person->person.phoneNumbers.stream())
	        		 .mapToDouble(i -> i).average().getAsDouble();

	        end=System.currentTimeMillis();

	        System.out.println("Parallel stream execution time : "+(end-start)+" : Avg salary : "+salaryWithParallelStream);

	}
}
