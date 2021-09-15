import java.util.*;
public class Converter {
	

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		//F - C conversion
		
		
		
		System.out.println("Please enter the Farenheit Tempreture that you would like to convert to Celsius: ");
		int inpFarenheit = inp.nextInt();
		FarenheitAndCelsius.fcConversion(inpFarenheit);
		System.out.println(inpFarenheit + "deg F in Celsius is " + FarenheitAndCelsius.celsius + "deg C");
		
		
		
		//Feet - Meters  Conversion
		
		System.out.println("Please enter the length in Feet that you would like to conver to meters: ");
		double inpFeet = inp.nextDouble();
		FeetAndMeters.fmConversion(inpFeet);
		System.out.println(inpFeet + "ft in meters is " + FeetAndMeters.meters + "m");
		
		
		//Pounds - Kg's conversion 
		
		System.out.println("Please enter the weight you would like to convert from pounds to kgs:");
		double inpPounds = inp.nextDouble();
		PoundsAndKg.pkConversion(inpPounds);
		System.out.println(inpPounds + "lb in Kg's is " + PoundsAndKg.kgs + "Kg's");
	}
}
