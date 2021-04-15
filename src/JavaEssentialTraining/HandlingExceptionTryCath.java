package JavaEssentialTraining;

public class HandlingExceptionTryCath {
	
	public static void main(String[] args) {
	
		String welcome = "Welome!";
		char[] chars = welcome.toCharArray();
		
		try {
			char lastChar = chars[chars.length -1];
			System.out.println(lastChar);
			
			String sub = welcome.substring(10);
			
		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("Array index problem!");
		}
		
	}
}
