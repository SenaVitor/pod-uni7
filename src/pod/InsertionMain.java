package pod;

import java.util.Arrays;
import java.util.Comparator;

public class InsertionMain {
	public static void main(String[] args) {
//		Integer[] a = {23, 12, 4, 2, 1};
		Integer[] a = {2, 12, 434, 26, 111};
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		};
		
		System.out.println(Arrays.toString(a));
		
		Sorter<Integer, Comparator<Integer>> sorter = new Insertion<Integer, Comparator<Integer>>();
		sorter.sort(a, comparator);
		
		System.out.println(Arrays.toString(a));
		
		String[] names = {"Roberio", "Vitor", "Andreia", "Lucas"};
		Comparator<String> stringComparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		
		System.out.println(Arrays.toString(names));
		Sorter<String, Comparator<String>> sorter2 = new Insertion<String, Comparator<String>>();
		sorter2.sort(names, stringComparator);
		System.out.println(Arrays.toString(names));
	}
}
