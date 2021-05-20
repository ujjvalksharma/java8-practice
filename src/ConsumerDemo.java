import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<Integer> consumer=(a)->System.out.println("value:"+a);
		
		consumer.accept(10);
		
		Predicate<Integer> predicate=(a)->a>1;
		
		Supplier<String> supplier=()->{
			return "I am from supplier";
		};
		
		
		List<Integer> listOfNum=Arrays.asList(1,2,3,4,5);
		
		listOfNum.stream().forEach(consumer);
		listOfNum.stream()
		.filter(predicate)
		.forEach((a)->System.out.println("value:"+a));
		
		
		
	}
}
