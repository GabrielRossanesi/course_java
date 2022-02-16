import java.util.Locale;
import java.util.Scanner;

public class funcao2grau {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("A: ");
		int a = sc.nextInt();
		System.out.print("B: ");
		int b = sc.nextInt();
		System.out.print("C: ");
		int c = sc.nextInt();
		double delta = (b * b - 4 * a * c);
		double raizDelta = Math.sqrt(delta);
		double x1 = (-b + raizDelta) / (2 * a);
		double x2 = (-b - raizDelta) / (2 * a);

		System.out.printf("O valor de delta é: %.1f%n", delta);

		System.out.print("Deseja o valor de x?");
		String cont = sc.next();
		
		if (cont != "n") {
			System.out.printf("Valor x1: %.1f%n", x1);
			System.out.printf("Valor x2: %.1f%n", x2);
		}

		if (delta == 0) {
			System.out.println("x' não pode ser calculado");
		}
		sc.close();
	}
}
