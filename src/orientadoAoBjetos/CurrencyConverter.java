package orientadoAoBjetos;

public class CurrencyConverter {
	
	public static final double IOF =6.0;
	
	
	public static double returnValReais(double dolar,double valueDolares) {
		return (dolar*valueDolares)+(dolar*valueDolares)*6/100;
		
	}
}
