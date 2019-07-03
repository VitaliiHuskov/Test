package collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Example1 {

	private static void removeAndPrint(List<String> list) {
		for (String str : list) {
			if (str.equals("two")) {
				list.remove("three");
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<String>();

		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");

		removeAndPrint(list);

	}
}
