import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {
	
	public static void main(String[] args) {
		List<Integer> allNum=Arrays.asList(1,2,3,4,5,6);
		
	Optional<Integer> maxVal=allNum.stream().reduce((a,b)->a>b?a:b);
int num1=	allNum.stream().reduce((a,b)->a>b?a:b).get();
	int num=maxVal.get();
	System.out.println(num);
		
	}

}
