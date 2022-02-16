import java.util.Locale;
import java.util.Scanner;

public class teste_bitabit {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;
		//*0b100000 = 32*//
		int n = sc.nextInt();
		
		if ((n & mask) != 0 ) {
			/*se o n bit a bit com a mask for diferente de 0 o sexto bit é igual a 1*/
			System.out.println("6th bit is true");
		} else {
			System.out.println("6th bit is false");
		}

		sc.close();
	}
}
