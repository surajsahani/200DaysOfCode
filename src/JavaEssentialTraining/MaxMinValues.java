package JavaEssentialTraining;

public class MaxMinValues {
	public static void main(String[] args) {
		
		byte b = 127;
		System.out.println("Byte:" + b);
		
		if (b <Byte.MAX_VALUE) {
			b++;
		}
		b++;
		
		System.out.println("Byte:" + b);
	}
}
