package pod;

import java.util.Comparator;

public interface Sorter<T, C extends Comparator<T>> {
	public void sort(T[] items, C comparator); 
}
