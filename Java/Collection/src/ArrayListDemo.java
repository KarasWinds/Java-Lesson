
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<>();
		list.add(new Integer(12));
		list.add(34);
		System.out.println(list);
		System.out.println(list.size());
		Iterator<Integer> objs = list.iterator();
		while (objs.hasNext())
			System.out.println(objs.next());
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		for (Integer i : list)
			System.out.println(i);
	}

}