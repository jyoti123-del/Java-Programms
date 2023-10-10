package reverse_vovel;

import java.util.Arrays;
import java.util.Collections;

public class SortArray1 {
	public static void main(String[] args) {
			Integer a[]= {2,9,78,90,56,5,3,43,95};
			System.out.println("Array before sorting "+Arrays.toString(a));
			Arrays.sort(a);
	        System.out.println("Array after sorting "+Arrays.toString(a));
	        Arrays.sort(a,Collections.reverseOrder());
	        System.out.println(Arrays.toString(a));
		}
}
