package cen4802C;

import java.util.Scanner;


public class Fibonacci 
{
	/**
	 * 
	 * @param num
	 * @return fibonacci sequence
	 * 
	 * A recursive sequence that returns the fibonacci value that the user requested.
	 */
	 public static int fibonacci(int num)
	 {
		 if (num <= 1)
			 return num;
		 
	    return fibonacci(num-1) + fibonacci(num-2);
	 }

	public static void main(String[] args) 
	{
/**
 * 
 * @author Miles Walker
 * @param num
 * @return
 * 
 * The main class asked for the user to input the level of the fibonacci sequence that they would like to see.
 * It then calls the fibonacci class and gives it the number that the user inputs.
 * Finally, it will tell the user what the fibonacci sequence is that they requested.
 * 
 */
	    int num;

	    Scanner input = new Scanner(System.in);

	    System.out.println("Enter Value of Fibonacci Sequence: ");
	    num = input.nextInt();

	    System.out.println("The " + num + "th term of the Fibonacci Sequence is " + fibonacci(num));
	    
	    input.close();
	}

}
