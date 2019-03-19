
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,String> tel = new HashMap<>();
		tel.put("john","0123456789");
		tel.put("Cindy","0922520520");
		tel.put("kiki","0987456321");
		String tel1 = tel.get("Cindy");
		System.out.println(tel1);
		for (String key : tel.keySet())
			System.out.println(key + "," + tel.get(key));
		for (String val : tel.values())
			System.out.println(val);

	}

}
