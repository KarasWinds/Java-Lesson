
import java.util.*;

public class GenericsDemo2 {
	public static void print(List<? extends Number> list) {
		Iterator<?> iter = list.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
	}

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		print(list1);
				
		List<Double> list2 = new ArrayList<>();
		list2.add(2.2);
		list2.add(5.8);
		print(list2);
	}

}
