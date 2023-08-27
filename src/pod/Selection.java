package pod;

import java.util.Comparator;

public class Selection<T, C extends Comparator<T>> implements Sorter<T, C> {
	public void sort(T[] items, C comparator) {
		for (int i = items.length - 1; i > 0; i--) {
			int index = findMax(items, i, comparator);
			T aux = items[i];
			items[i] = items[index];
			items[index] = aux;
		}
	}
	
	public int findMax(T[] items, int index, C comparator) {
		int max = index;
		for(int i = 0; i < index; i++) {
			if(comparator.compare(items[i], items[max]) > 0) {
				max = i;				
			}
		}
		return max;
	}
}
