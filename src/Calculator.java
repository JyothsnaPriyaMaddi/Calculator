import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int number1 = sc.nextInt();
		System.out.println("Enter second number:");
		int number2 = sc.nextInt();
		
		System.out.println("Choose one of these actions(+, -, *, /, %)");
		char operator = sc.next().charAt(0);
		
		int result = 0;
		
		switch(operator) {
			case '+': 
				result = number1 + number2;
				break;
			case '-':
				result = number1 - number2;
				break;
			case '*': 
				result = number1 * number2;
				break;
			case '/':
				result = number1 / number2;
				break;
			case '%': 
				result = number1 % number2;
				break;
		}
		System.out.println("Result is:" +result);
	}
}
