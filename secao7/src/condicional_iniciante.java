import java.util.Scanner;

public class condicional_iniciante {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;

		System.out.println("Digite um n�mero");
		x = sc.nextInt();

		if (x < 0) {
			System.out.println("N�mero negativo");
		}
		else 
			System.out.println("N�mero positivo");
		
		sc.close();
	}
}
