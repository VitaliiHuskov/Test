package collections;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(0);
		Integer[] array = {};
		list.toArray(array);
		System.out.println(list.get(1));
		System.out.println(array[0]);
	}

}
