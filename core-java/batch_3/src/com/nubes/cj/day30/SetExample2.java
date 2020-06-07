package com.nubes.cj.day30;

import java.util.ArrayList;
import java.util.List;

class Example<T>{
	List<T> list = new ArrayList<>();
	
	void add(T ele) {
		list.add(ele);
	}
	List<T> getList(){
		return list;
	}
}
class A{
	
}

class B extends A{
	
}
class C extends B {
	
}
public class SetExample2 {
	public static void main(String[] args) {
//		Example<Integer> obj = new Example<>();
//		obj.add(1001);
//		obj.add(1002);
//		obj.add(1003);
//		List<Integer> list1 = new ArrayList<>();
//		List<Float> list2 = new ArrayList<>();
//		List<Double> list3= new ArrayList<>();
//		sumOfList(list1);
//		sumOfList(list2);
//		sumOfList(list3);
		
		List<B> l1= new ArrayList<>();
		List<A> l2= new ArrayList<>();
		List<C> l3= new ArrayList<>();
		List<Object> l4=new ArrayList<>();
		
		sumOfList(l2);
		sumOfList(l3);
		sumOfList(l4);
		
		
		
	}
	
	public static double sumOfList(List<? super C> list) {
	    return 0.0;
	}
}
