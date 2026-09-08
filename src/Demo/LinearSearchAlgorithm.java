package Demo;

public class LinearSearchAlgorithm {
	static int linearSearch(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {10,25,7,42,18,30};
		int target =42;
		int result=linearSearch(arr,target);
		if(result!=-1) {
			System.out.println("Element Found at index: "+result);
		}
		else {
			System.out.println("Element Not Found!");
		}
	}
}

//o/p:-
//Element Found at index: 3

