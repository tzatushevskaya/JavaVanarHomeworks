
public class ConvertTemperature {
	
	public static void main(String[] args) {
	
		Quick.calculation(1.0, "C", "K");

	}

}

class Celsius {
	
	static double toReaumur (double value) {		
		return value * 0.8;
	}
	
	static double toFahrenheit (double value) {		
		return (value * 1.8 + 32);
	}
	
	static double toRankine (double value) {
		return (value + 273.15) * 1.8;
	}
	
	
	static double toKelvin (double value) {
		return (value + 273.15);
	}
		
}

class Reaumur {
	
	static double toCelsius (double value) {
		return  value / 0.8;
	}
	
	static double toFahrenheit (double value) {
		return value * 2.25 + 32;
	}
	
	static double toRankine (double value) {
		return value * 2.25 + 491.67;
	}
	
	static double toKelvin (double value) {
		return value / 0.8 + 273.15;
	}
		
}

class Fahrenheit {
	
	static double toCelsius (double value) {
		return (value - 32)/1.8;
	}
	
	static double toReaumur (double value) {
		return (value - 32)/1.8 * 0.8;
	}
	
	static double toRankine (double value) {
		return value - 32 + 491.67;
	}
	
	static double toKelvin (double value) {
		return (value - 32)/1.8 + 273.15;
	}
		
}

class Rankine {
	
	static double toCelsius (double value) {
		return value / 1.8 - 273.15;
	}
	
	static double toReaumur (double value) {
		return (value / 1.8 - 273.15) * 0.8;
	}
	
	static double toFahrenheit (double value) {
		return value - 459.67;
	}
	
	static double toKelvin (double value) {
		return value / 1.8;
	}
		
}

class Kelvin {
	
	static double toCelsius (double value) {
		return value - 273.15;
	}
	
	static double toReaumur (double value) {
		return value - 273.15;
	}
	
	static double toFahrenheit (double value) {
		return (value - 273.15) * 1.8 + 32;
	}
	
	static double toRankine (double value) {
		return value * 1.8;
	}	
		
}

class Quick {
	
	static void calculation (double temp1, String initUnit, String finalUnit) {
		String s = initUnit + finalUnit;
		double temp2 = 0.00;
		switch (s) {
		case "CRe":
			temp2 = Celsius.toReaumur(temp1);			
			break;
		case "CF":
			temp2 = Celsius.toFahrenheit(temp1);	
			break;
		case "CR":
			temp2 = Celsius.toRankine(temp1);
			break;
		case "CK":
			temp2 = Celsius.toKelvin(temp1);
			break;
		case "ReC":
			temp2 = Reaumur.toCelsius(temp1);			
			break;
		case "ReF":
			temp2 = Reaumur.toFahrenheit(temp1);	
			break;
		case "ReR":
			temp2 = Reaumur.toRankine(temp1);
			break;
		case "ReK":
			temp2 = Reaumur.toKelvin(temp1);
			break;
		case "FRe":
			temp2 = Fahrenheit.toReaumur(temp1);			
			break;
		case "FC":
			temp2 = Fahrenheit.toCelsius(temp1);	
			break;
		case "FR":
			temp2 = Fahrenheit.toRankine(temp1);
			break;
		case "FK":
			temp2 = Fahrenheit.toKelvin(temp1);
			break;
		case "RRe":
			temp2 = Rankine.toReaumur(temp1);			
			break;
		case "RF":
			temp2 = Rankine.toFahrenheit(temp1);	
			break;
		case "RC":
			temp2 = Rankine.toCelsius(temp1);
			break;
		case "RK":
			temp2 = Rankine.toKelvin(temp1);
			break;
		case "KRe":
			temp2 = Kelvin.toReaumur(temp1);			
			 break;
		case "KF":
			temp2 = Kelvin.toFahrenheit(temp1);	
			break;
		case "KR":
			temp2 = Kelvin.toRankine(temp1);
			break;
		case "KC":
			temp2 = Kelvin.toCelsius(temp1);
			break;
			}
		System.out.print(temp1 + " " + initUnit + " = ");
		System.out.printf("%.2f", temp2);
		System.out.println(" " + finalUnit);	
	}
	
}

