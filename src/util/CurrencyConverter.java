package util;

public class CurrencyConverter {
	
	public static double convert(double price, double dollar) {
		return ((price * dollar * 0.06) + (price * dollar));
	}

}
