import java.util.Scanner;
class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter operator(+,-.*,/):\n");
		char operator = sc.next().charAt(0);
		System.out.println("Enter first number:");
		double num1 = sc.nextDouble();
		System.out.println("Enter Second number:");
		double num2 = sc.nextDouble();
		double result;
		switch(operator)
		{
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;

			case '*':
				result = num1 * num2;
				break;

			case '/':
				if (num2 == 0)
				{
					System.out.println("Error: Division by zero is not possible.");
					return;
				}
				result = num1 / num2;
				break;
			default:
				System.out.println("Invalid operator.");
				return;
			}
			System.out.println("Result = "+ result);
			sc.close();
		}
}

