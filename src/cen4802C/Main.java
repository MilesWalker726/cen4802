package cen4802C;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{

		double num1, num2;
		int function = 0;
		Scanner input = new Scanner(System.in); 
			
		System.out.println("Please enter two numbers: ");
			
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		
		while (function != 6)
		{
			
			System.out.println("\nWhich fuction would you like to preform: \n1.) Add\n2.) Subtract\n3.) Multiply\n4.) Divide\n5.) Enter New Numbers\n6.) Exit");
			function = input.nextInt();		
			
			if (function == 1)
			{
				System.out.println("\n" + num1 + " + " + num2 + " = " + additionFunction(num1, num2));
			}
			
			else if (function == 2)
			{
				System.out.println("\n" + num1 + " - " + num2 + " = " + subtractionFunction(num1, num2));
			}
			
			else if (function == 3)
			{
				System.out.println("\n" + num1 + " * " + num2 + " = " + multiplyFunction(num1, num2));
			}
				
			else if (function == 4)
			{
				if(num2 != 0)
				{				
					System.out.println("\n" + num1 + " / " + num2 + " = " + divideFunction(num1, num2));
				}
				
				else 
				{
					System.out.println("\nError: Cannot Divide By Zero!");
									
				}
			}
			
			else if (function == 5)
			{
				System.out.println("\nPlease enter two numbers: ");
				
				num1 = input.nextDouble();
				num2 = input.nextDouble();
			}
			
			else if (function == 6)
			{
				System.out.println("\nThank you for using my Simple Calculator!");
				input.close();
			}
			
			else
				System.out.println("\nInput is invalid.  Please try again.");
		}

	}

	public static double additionFunction(double num1,double num2)
	{
		double total = num1 + num2;

		return total;
	}
	
	public static double subtractionFunction(double num1,double num2)
	{
		double total = num1 - num2;

		return total;
	}
	
	public static double multiplyFunction(double num1,double num2)
	{
		double total = num1 * num2;

		return total;
	}
	
	public static double divideFunction(double num1,double num2)
	{
		double total = num1 / num2;
			
		return total;
	}
}

