package algorithms.search;

public class BinarySearch {

	public static void main(String[] args) {
		Integer[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		Integer target = 10;
		System.out.println(binarySearch(arr, target, 0, arr.length - 1));
	}

	
	public static int binarySearch(Integer[] arr, Integer target, int low, int high) {
		int mid = Math.floorDiv(high - low, 2) + low;
		System.out.println("low: " + low + " high: " + high + " mid: " + mid);
		
		if (target.equals(arr[mid])) {
			return mid;	//value found
		} else if (arr[low].equals(arr[high])) {
			return -1;	//value not found in the array
		} else if (target > arr[mid]) {
			return binarySearch(arr, target, mid + 1, high);
		} else if (target < arr[mid]){
			return binarySearch(arr, target, low, mid - 1);
		} else {
			return -1;
		}
	}
}
