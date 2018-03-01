import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		double n = 0;
/*
		System.out.println("Calculate in the following format:");
		System.out.println("\n operator: + = 1 ; - = 2 ; / = 3 ; * = 4");
		Scanner scanner= new Scanner (System.in);
		System.out.println("\n first number:");
		double num1= scanner.nextDouble();
		System.out.println("\n operator:");
		int operator= scanner.nextInt();
		System.out.println("\n second number:");
		double num2= scanner.nextDouble();
		scanner.close(); 
*/
		Scanner scanner= new Scanner(System.in);
		System.out.println("pls give input boss");
		String calculation= scanner.nextLine();
		
		double num1= Double.parseDouble(calculation.split(" ")[0]);
		double num2= Double.parseDouble(calculation.split(" ")[2]);

		String operator=calculation.split(" ")[1];
		scanner.close();
		
		switch(operator)
		{
			case "+": // case 1
				n = num1 + num2;
				break;
			case "-": // case 2
				n = num1 - num2;
				break;
			case "/": // case 3
				if (num2 == 0) 
					{
					System.out.println("can't divide by 0 ._.");
					break;
					}
				n = num1 / num2;
				break;
			case "*": // case 4
				n = num1 * num2;
				break;
		}
		System.out.println(n);
	}

}
