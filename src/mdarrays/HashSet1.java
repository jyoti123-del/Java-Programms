package mdarrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<Object> set=new HashSet<>();// 
		set.add(10);
		set.add("list");
		set.add('A');
		set.add("jyoti");
		set.add(10.6f);
		System.out.println(set);
		for(Object k:set) {
			System.out.println(k);}
		ArrayList<Object> list=new ArrayList<>(set);
		System.out.println(list);
		System.out.println(list.get(3));
			

	}

}
