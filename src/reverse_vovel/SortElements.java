package reverse_vovel;

import java.util.Arrays;

public class SortElements {
public static void main(String[] args) {
			String s="lanje";
			char a[]=s.toCharArray();
			System.out.println("before sorting "+Arrays.toString(a));
			Arrays.sort(a);
			System.out.println("after sorting "+Arrays.toString(a));

		}
}
