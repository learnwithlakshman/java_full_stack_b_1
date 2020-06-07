package com.nubes.cj.day24;
class OneException extends Exception{
	
}
class TwoException extends OneException{
	
}
class ThreeException extends TwoException{
	
}

class C1{
		public void m1() throws TwoException{
			
		}
}
class C2 extends C1{
		public void m1() {
			
		}
}

class One{
	{
		System.out.println("IIB block-1");
	}
	static {
		System.out.println("Static block");
	}
	One(){
		
	}
	One(int a){
		
	}
	One(int a,int b){
		
	}
	{
		System.out.println("IIB Block-2");
	}
}

public class ExceptionExample2 {
		public static void main(String[] args) {
			One obj1 = new One();
			One obj2 = new One(10);
			One obj3 = new One(10,20);
			
		}
	
}
