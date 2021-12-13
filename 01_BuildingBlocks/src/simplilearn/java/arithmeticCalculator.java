package simplilearn.java;

import java.util.Scanner;

//As a developer, write a Java code to create a calculator to perform the 
//four basic arithmetic operations (addition, subtraction, multiplication, and division).

public class arithmeticCalculator {

	public static void main(String[] args) {

		int choice;
		do {
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("0. Exit");

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice?");
			choice = sc.nextInt();

			if (choice == 0)
				break;

			System.out.println("Enter number 1?");
			int num1 = sc.nextInt();
			System.out.println("Enter number 2?");
			int num2 = sc.nextInt();
			System.out.println("*****************");
			
			switch (choice) {
			case 1:
				System.out.println("Addition result is: " + (num1 + num2));
				break;
			case 2:
				System.out.println("Subtraction result is: " + (num1 - num2));
				break;
			case 3:
				System.out.println("Multiplication result is: " + (num1 * num2));
				break;
			case 4:
				System.out.println("Division result is: " + (num1 / num2));
				break;
			default:
				System.out.println("Not a valid choice");
				break;
			}
			System.out.println("*****************\n");
		} while (choice != 0);
	}

}
