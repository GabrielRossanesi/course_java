package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product;

		System.out.println("Enter account number: ");
		int accountN = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.println("Is there a initial deposit? (y/n) :");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			product = new Product(accountN, holder, initialDeposit);
		} else {
			product = new Product(accountN, holder);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(product);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		product.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(product);
		
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		product.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(product);
		
		sc.close();
	}

}
