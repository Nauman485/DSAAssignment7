package geekster;

public class Sum_of_ele_Recr {
	public static void main (String []args) {
		int []arr= {1,2,5,5,10};
		System.out.println(sum(arr, arr.length-1));
	}
	static int sum(int []arr, int size) {
		if(size<0) {
			return 0;
		}
		int sum=arr[size]+sum(arr, --size);
		return sum;
	}

}
