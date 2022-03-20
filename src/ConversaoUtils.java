
public class ConversaoUtils {
	
	public static double toCelsius(double ValorFahrenheit) throws FahrenheitExeption  {
		
		if(ValorFahrenheit < -459.67) {
			throw new FahrenheitExeption();
		}
		
		return (5 * (ValorFahrenheit - 32 )) / 9;
	}

}
