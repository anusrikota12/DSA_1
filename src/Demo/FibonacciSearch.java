package Demo;

public class FibonacciSearch {
	static int fibonacciSearch(int[] arr,int target) {
		int n=arr.length;
		int fib1=0;
		int fib2=1;
		int fib=fib1+fib2;
		while(fib<n) {
			fib1=fib2;
			fib2=fib;
			fib=fib1+fib2;
		}
		int offset=-1;
		while(fib>1) {
			int i=Math.min(offset+fib1, n-1);
			if(arr[i]<target) {
				fib=fib2;
				fib2=fib1;
				fib1=fib-fib2;
				offset=i;
			} else if(arr[i]>target) {
				fib=fib1;
				fib2=fib2-fib1;
				fib1=fib-fib2;
			} else {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80,90,100};
		int target=90;
		System.out.println(fibonacciSearch(arr,target));
	}
}
