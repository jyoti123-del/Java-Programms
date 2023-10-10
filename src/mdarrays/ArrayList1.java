package mdarrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList <String> k =new ArrayList<>();
		k.add("jyoti");
		k.add("swati");
		k.add("preeti");
		k.add("sneha");
		k.add("neha");
		k.add("megha");
		System.out.println(k);
		k.add(4, "viju");
		k.get(2);
		Collections.sort(k);
		System.out.println(k);
		Collections.reverse(k);
		System.out.println(k); 
		k.remove(0);
		System.out.println(k);
	}

}
