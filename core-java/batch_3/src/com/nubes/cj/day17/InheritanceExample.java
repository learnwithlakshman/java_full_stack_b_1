package com.nubes.cj.day17;

class One {

	void show() {
		System.out.println("One - Show");
	}

}

class Two extends One {

	void show() {
		System.out.println("Two - Show");
	}

	void show1() {
		System.out.println("Two - Show1");
	}

}

class Three extends One {
	void show() {
		System.out.println("Three - Show");
	}

	void show2() {
		System.out.println("Three - Show1");
	}
}

public class InheritanceExample {
	public static void main(String[] args) {

		One obj = getObject();
		obj.show();
		if (obj instanceof Two) {
			Two ob = (Two) obj;
			ob.show1();
		}else if(obj instanceof Three) {
			Three ob = (Three) obj;
			ob.show2();
		}

	}

	private static One getObject() {

		return new Three();
	}

}
