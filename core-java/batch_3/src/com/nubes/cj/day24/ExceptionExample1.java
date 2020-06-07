package com.nubes.cj.day24;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ExceptionExample1 {
	public static void main(String[] args){
			
			try {
				Scanner sc = new Scanner(Paths.get("userdata.txt"));
				while(sc.hasNextLine()) {
					String data = sc.nextLine();
					String arr[] = data.split(",");
					String name = arr[1].substring(0,3);
					int age = Integer.parseInt(arr[2]);
					System.out.println(String.format("Name :%s and Age :%d", name,age));
				}
				
			} catch (IOException e) {
				// create file
				e.printStackTrace();
			}catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}catch (StringIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
	}	
			
	
}
