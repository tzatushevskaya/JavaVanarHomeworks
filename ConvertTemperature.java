
public class ConvertTemperature {
	
	public static void main(String[] args) {
	
	double n = Celsius.toReaumur(1);
	System.out.printf("%.2f", n);
	Celsius.toFahrenheit(1);
	Celsius.toRankine(1);
	Celsius.toKelvin(1);
	Reaumur.toCelsius(1);
	Reaumur.toFahrenheit(1);
	Reaumur.toRankine(1);
	Reaumur.toKelvin(1);
	Fahrenheit.toReaumur(1);
	Fahrenheit.toCelsius(1);
	Fahrenheit.toRankine(1);
	Fahrenheit.toKelvin(1);
	Rankine.toReaumur(1);
	Rankine.toFahrenheit(1);
	Rankine.toCelsius(1);
	Rankine.toKelvin(1);
	Kelvin.toReaumur(1);
	Kelvin.toFahrenheit(1);
	Kelvin.toCelsius(1);
	Kelvin.toRankine(1);

	}

}

class Celsius {
	
	static double toReaumur (int value) {
		
		return (value * 0.8) ;
	}
	
	static void toFahrenheit (float value) {
		System.out.println(value + " C = " + value * 1.8 + 32 + " F");
	}
	
	static void toRankine (float value) {
		System.out.println(value + " C = " + (value + 273.15) * 1.8 + " R");
	}
	
	
	static void toKelvin (float value) {
		System.out.println(value + " C = " + value + 273.15 + " K");
	}
		
}

class Reaumur {
	
	static void toCelsius (float value) {
		System.out.println(value + " Re = " + value / 0.8 + " C");
	}
	
	static void toFahrenheit (float value) {
		System.out.println(value + " Re = " + value * 2.25 + 32 + " F");
	}
	
	static void toRankine (float value) {
		System.out.println(value + " Re = " + value * 2.25 + 491.67 + " R");
	}
	
	static void toKelvin (float value) {
		System.out.println(value + " Re = " + value / 0.8 + 273.15 + " K");
	}
		
}

class Fahrenheit {
	
	static void toCelsius (float value) {
		System.out.println(value + " F = " + (value - 32)/1.8 + " C");
	}
	
	static void toReaumur (float value) {
		System.out.println(value + " F = " + (value - 32)/1.8 * 0.8 + " Re");
	}
	
	static void toRankine (float value) {
		System.out.println(value + " F = " + (value - 32 + 491.67) + " R");
	}
	
	static void toKelvin (float value) {
		System.out.println(value + " F = " + (value - 32)/1.8 + 273.15 + " K");
	}
		
}

class Rankine {
	
	static void toCelsius (float value) {
		System.out.println(value + " R = " + (value / 1.8 - 273.15) + " C");
	}
	
	static void toReaumur (float value) {
		System.out.println(value + " R = " + (value / 1.8 - 273.15) * 0.8 + " Re");
	}
	
	static void toFahrenheit (float value) {
		System.out.println(value + " R = " + (value - 459.67) + " F");
	}
	
	static void toKelvin (float value) {
		System.out.println(value + " R = " + value / 1.8 + " K");
	}
		
}

class Kelvin {
	
	static void toCelsius (float value) {
		System.out.println(value + " K = " + (value - 273.15) + " C");
	}
	
	static void toReaumur (float value) {
		System.out.println(value + " K = " + (value - 273.15) * 0.8 + " Re");
	}
	
	static void toFahrenheit (float value) {
		System.out.println(value + " K = " + (value - 273.15) * 1.8 + 32 + " F");
	}
	
	static void toRankine (float value) {
		System.out.println(value + " K = " + (value * 1.8) + " R");
	}	
		
}
