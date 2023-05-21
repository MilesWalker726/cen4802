package cen4802C;

import java.util.Scanner;


public class Fibonacci 
{

	 public static int fibonacci(int num)
	 {
		 if (num <= 1)
			 return num;
		 
	    return fibonacci(num-1) + fibonacci(num-2);
	 }
	
	public static void main(String[] args) 
	{

	    int num;

	    Scanner input = new Scanner(System.in);

	    System.out.println("Enter Value of Fibonacci Sequence: ");
	    num = input.nextInt();

	    System.out.println("The " + num + "th term of the Fibonacci Sequence is " + fibonacci(num));
	    
	    input.close();
	}

}
