import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Training {
	public static void main(String s[]){
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		List<Integer> res = numbers.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println(res);
	}
}
