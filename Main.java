import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 4, 5, 1, 5, 4);
		Map<Integer, Integer> countMap = new HashMap<>();
		countElements(list, countMap);
		System.out.println(countMap);
	}

	private static void countElements(List<Integer> list, Map<Integer, Integer> countMap) {
		for (int i : list) {
			if (countMap.containsKey(i)) {
				countMap.put(i, countMap.get(i) + 1);
			} else {
				countMap.put(i, 1);
			}
		}
	}

}
