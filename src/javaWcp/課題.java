package javaWcp;

public class 課題 {
	public static void main(String[]args) {
		for(int number=1;number<=100;number++) {
			System.out.println(number);
			
			if(number%3==0&&number%5==0) {
			System.out.println("Fizz");
			 }else if(number%3==0) {
				System.out.println("Fizz");
			 } else if(number%5==0) {
			 System.out.println("Buzz");
			 } else {
				 System.out.println(number);
			 }
		}
	}
}

