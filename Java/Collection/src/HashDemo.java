
import java.util.*;

public class HashDemo {

	public static void main(String[] args) {
		//Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set = new HashSet<>();
		set.add(new Integer(12));
		set.add(34);
		System.out.println(set);
		System.out.println(set.size());
		Iterator<Integer> obj = set.iterator();
		while (obj.hasNext())
			System.out.println(obj.next());
		for(Integer i : set)
			System.out.println(i);
	}

}
