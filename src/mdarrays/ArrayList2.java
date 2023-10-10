package mdarrays;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Object> k= new ArrayList<>();
		k.add(12);
		k.add("Asha");
		k.add('k');
		k.add('@');
		k.add("jyoti");
    System.out.println(k);
    System.out.println(k.size());
    for(int i=0;i<=k.size()-1;i++) {
    	System.out.println(k.get(i));
    }
    System.out.println();
    for(Object a:k) {
    	System.out.println(a);
    }
	}

}
