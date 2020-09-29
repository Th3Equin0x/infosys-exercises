package algorithms.search;

public class LinearSearch {

	public static void main(String[] args) {
		Integer[] arr = {1, 9, 2, 8, 3, 7, 4, 6, 5};
		Integer target = 7;
		System.out.println(linearSearch(arr, target));
	}
	
	public static <T> int linearSearch(T[] arr, T target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(target)) 
				return i;
		}
		return -1;
	}
}
