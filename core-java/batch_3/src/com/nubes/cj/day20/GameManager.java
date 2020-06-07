package com.nubes.cj.day20;

import java.util.Scanner;

abstract class Game {
	
	public void start() {
		System.out.println("The game :" + this.getClass().getSimpleName() + " is started");
	}
	public abstract void play();
	public void stop() {
		System.out.println("The game :" + this.getClass().getSimpleName() + " is stopped");
	}
}

class Bike extends Game {
	@Override
	public void play() {
		System.out.println("You are ready to play : Bike game");
	}
}
class Bicycle extends Game{
	@Override
	public void play() {
		System.out.println("You are ready to play : Bicycle game");
	}
	
}

class Car extends Game{

	@Override
	public void play() {
		System.out.println("You are ready to play : Car game");
	}
	
}

public class GameManager {
	public static void main(String[] args) {
		Game game = getRandomGame();
		game.start();
		game.play();
		game.stop();
	}
	private static Game getRandomGame() {
		System.out.println("1.Bike 2.Bicycle 3.Car Enter your choice:");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		if(ch == 1) {
			return new Bike();
		}else if(ch == 2) {
			return new Bicycle();
		}else if(ch==3) {
			return new Car();
		}
		throw new IllegalArgumentException("Please enter valid game type ( 1,2,3 ) only");
	}
}
