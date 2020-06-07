package com.nubes.cj.day18;

import static java.lang.Math.PI;
import static java.lang.Math.floor;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.System.out;

class AA {
	static {
		System.out.println("AA");
	}

	AA() {
		System.out.println("Constructor of AA");
	}
}

class BB extends AA {
	static {
		System.out.println("BB");
	}

	BB() {
		System.out.println("Constructor of BB");
	}
}

public class StaticKeyWordExample {

	static {
		System.out.println("Static block.... 1");
	}

	static {
		System.out.println("Static block.... 2");
	}

	public static void main(String[] args) {

		out.println(sqrt(16));
		out.println(PI);
		out.println(pow(2, 5));
		out.println(floor(4.5));

		System.out.println("Main method");

		AA obj = new BB();
	}

	static {
		System.out.println("Static block.... 3");
	}

}
