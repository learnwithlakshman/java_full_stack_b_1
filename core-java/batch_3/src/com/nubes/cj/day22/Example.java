package com.nubes.cj.day22;

interface One{
	 int a=10;
      public void show();
}

interface Two{
	  int a=20;
      public void show();
}

interface Three{
    public void show();
    //public int toString();
}
@FunctionalInterface
interface Formater{

	public String getData();
	
	default void showInUpperCase(){
		String data = getData();
		System.out.println(data.toUpperCase());

	}

}
@FunctionalInterface
interface Calc{
	
	public int perform(int one, int two);
}

class UserData implements Formater{

	public String getData(){
		return "Welcome to Java world Mr.krish";
	}
	

}
public class Example {

    	public static void main(String[] args) {
			Formater f = new UserData();
			f.showInUpperCase();
		
			
			Formater fm = ()-> "Welcome to Java world Mr.Venkat";
			fm.showInUpperCase();
			
			Calc c1 = (a,b)-> a * b;
			
			int res = c1.perform(10, 20);
			System.out.println(res);
		}
      
     
     
}