package aplicacao;

public class programa {
	
	public static double price;
	public static double buyDollar;
	static double tax = 6 / 100;
			
	public static double dollarReal = price * buyDollar;
	
	public static double dollar =  dollarReal * tax;
}
