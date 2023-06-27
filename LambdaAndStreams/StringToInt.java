package LambdaAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("1","2");
		List<Integer> list1=list.stream().map(Integer::valueOf).collect(Collectors.toList());
		list1.forEach(System.out::println);
		
		int[] nums=list.stream().mapToInt((v)->Integer.valueOf(v)).toArray();
		System.out.println(Arrays.toString(nums));
		
		String[][] deepArray = new String[][] {{"John", "Mary"}, {"Alice", "Bob"}};
		System.out.println(Arrays.deepToString(deepArray));
		
		Arrays.stream(nums).forEach(System.out::println);
		
	}

}
