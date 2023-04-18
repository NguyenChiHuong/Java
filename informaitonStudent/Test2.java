package informaitonStudent;

import java.util.Arrays;

public class Test2 {
	public static int[] revert(int[] x) {
		int[] b = new int[x.length];
		int index = 0;
		for(int i = x.length-1; i >= 0;i--) {
			b[index] = x[i];
			index++;
		}
		return b;
	}
	public static void main(String[] args) {
		int[] a = new int[] {1,4,2,6,9,7};
		
		System.out.println("Truoc khi xap xep: " + Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("Sau khi xap xep tang: " + Arrays.toString(a));
		
		Arrays.sort(a);
		a = Test2.revert(a);
		System.out.println("Sau khi xap xep giam: " + Arrays.toString(a));
		
		System.out.println("Tim kiem: " + Arrays.binarySearch(a, 6));
		Arrays.fill(a, 5);
		System.out.println(": " + Arrays.toString(a));
		
		//split dùng để phân tách chuỗi trong java (string)
	}
}
