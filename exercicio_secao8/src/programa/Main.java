package programa;

import java.util.Locale;
import java.util.Scanner;
import dados.Dados_main;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Dados_main rect = new Dados_main();
		
		System.out.println("Entre com os dados do triangulo: ");
		rect.height = sc.nextDouble();
		rect.width = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		
		sc.close();
	}

}
