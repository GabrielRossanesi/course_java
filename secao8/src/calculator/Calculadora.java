package calculator;

import java.util.Locale;
import java.util.Scanner;
import aplicacao.programa;

public class Calculadora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		

		System.out.println("What is the dollar price? ");
		programa.price = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		programa.buyDollar = sc.nextDouble();
		System.out.printf("Amount to be paid in reais: %.2f%n", programa.dollar);

		sc.close();
	}

}
