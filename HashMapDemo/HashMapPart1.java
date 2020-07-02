package HashMapDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class HashMapPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("usa", 200);
		map.put("uk", 150);
		map.put("india", 300);
		map.put("china", 350);
		map.put("sweden", 100);
		System.out.println(map);
		System.out.println(map.get("china"));
		System.out.println(map.get("rsa"));
		System.out.println(map.remove("usa"));
		map.put("india", 310);
		System.out.println(map);
		System.out.println(map.containsKey("india"));
		System.out.println("**************Keys*************");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
		}
		System.out.println("***********Values**********");
		Collection<Integer> value = map.values();
		for (int val : value) {
			System.out.println(val);
		}
		System.out.println("********EnrtySet*****");
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + ">>=" + entry.getValue());

		}
//		part 2
		System.out.println("******** Max occuring character****************");
		String str = "aabbaaabcdda";
		System.out.println(getMaxFreq(str));
//	part 3
		System.out.println("********Intersection****************");
		int[] one = { 5, 1, 3, 4, 7 };
		int[] two = { 2, 4, 3, 5, 7, 10, 15 };
		ArrayList<Integer> list = getIntersection(one, two);
		System.out.println(list);

	}

	public static char getMaxFreq(String str1) {
		HashMap<Character, Integer> mapp = new HashMap<>();
		for (int i = 0; i < str1.length(); i++) {
			char cc = str1.charAt(i);
			if (mapp.containsKey(cc)) {
				int ov = mapp.get(cc);
				int nv = ov + 1;

			} else {
				mapp.put(cc, 1);

			}
		}
		int max = 0;
		char maxchar = '\0';
		Set<Map.Entry<Character, Integer>> entries = mapp.entrySet();
		for (Map.Entry<Character, Integer> entry : entries) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				maxchar = entry.getKey();
			}
		}
		return maxchar;

	}

	public static ArrayList<Integer> getIntersection(int[] one, int[] two) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < one.length; i++) {
			map.put(one[i], false);
		}
		for (int j = 0; j < two.length; j++) {
			if (map.containsKey(two[j])) {
				map.put(two[j], true);

			}
		}
		Set<Map.Entry<Integer, Boolean>> entries = map.entrySet();
		for (Map.Entry<Integer, Boolean> entry : entries) {
			if (entry.getValue()) {
				list.add(entry.getKey());
			}

		}
		return list;
	}

}
