package JavaEssentialTraining;
 
import java.math.BigDecimal;
public class BigDecimalExample {
	public static void main(String[] args) {
		
		// create two new BigDecimals
		BigDecimal bd1 =
				new BigDecimal("124567890.098765432");
		BigDecimal bd2 =
				new BigDecimal("987654321.123456789");
		
		// additional of two BigDecimals
		bd1 = bd1.add(bd2);
		System.out.println("BigDecimal1 = " + bd1);
		
		// Multiplication of two BigDecimals
		bd1 = bd1.multiply(bd2);
		System.out.println("BigDecimal2 = " + bd2);
		
		// Division of two BigDecimals
		bd1 = bd1.divide(bd2);
		System.out.println("BigDecimal3 = " + bd1);
		
		// BigDeciaml1 raised to the power of 2
		bd1 = bd1.pow(2);
		System.out.println("BigDecimal4 = " + bd1 );
		
	}
}
