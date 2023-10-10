package forloop;
import java.util.Arrays;
import java.util.Collections;
public class C1 {

	public static void main(String[] args) {
		Integer a[]={2,9,78,8,200,6,4,7,55};
		System.out.println("array before sorting is "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("array after sorting is "+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		Arrays.sort(a,Collections.reverseOrder());// write integer instead of int
		System.out.println(Arrays.toString(a));

	}

}
