package mdarrays;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Object> list=new LinkedList<>();// 
		list.add(10);
		list.add("list");
		list.add('A');
		list.add("jyoti");
		list.add(10.6f);
		System.out.println(list);
		for(Object k:list) {
			System.out.println(k);}
			System.out.println(list.get(2));
		
	}

}
