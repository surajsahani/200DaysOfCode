package JavaEssentialTraining;

import java.text.NumberFormat;
import java.util.Locale;


public class numaricValues {
	
	public static void main(String[] args) {
		
		Locale local = new Locale("da","OK");
		
		double doubleValue = 1_223_456.89;
		
		NumberFormat numF = NumberFormat.getNumberInstance(local);
		System.out.println("Number: " + numF.format(doubleValue));
		
		NumberFormat curF = NumberFormat.getNumberInstance(local);
		System.out.println("Number: " + curF.format(doubleValue));

		NumberFormat intF = NumberFormat.getNumberInstance(local);
		System.out.println("Number: " + intF.format(doubleValue));
		
	}
}

