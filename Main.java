import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		char op = ' ';
		double resultado = 0;
		double a, b;
		Scanner scanner = new Scanner(System.in);

		while (op != 'c') {
		System.out.print("Insira operação a ser feita [+-/*]: ");
		op = scanner.next().charAt(0);
		scanner.nextLine();
		System.out.print("Insira número 1: ");
		a = scanner.nextDouble();
		System.out.print("Insira número 2: ");
		b = scanner.nextDouble();
			switch (op) {
				case '+':
					resultado = a + b;
					break;
				case '-':
					resultado = a - b;		
					break;
				case '*':
					resultado = a * b;
					break;
				case '/':
					resultado = a / b;
					break;
				default:
					resultado = 0;
					System.out.println("Operação inválida");
			}
			System.out.println("Resultado: " + resultado);
		}
		scanner.close();
	}
}
