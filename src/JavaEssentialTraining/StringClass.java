package JavaEssentialTraining;

public class StringClass {
	public static void main(String[] args) {
		String s1 = "This is s String!";
		System.out.println(s1);
		
		String s2 = new String("this is also a String!");
		System.out.println(s2);
		
		String s3 = "Shirt size:";
		String s4 = "M";
		String s5 = s3 + s4 + ", Qty: " + 4;
		System.out.println(s5);
		
		char[] chars = {'H', 'e', 'l', 'o'};
		String s6 = new String(chars);
		System.out.println(s6);
		
		char[] chars2 = s6.toCharArray();
		for (char c : chars2) {
			System.out.println(c);
		}
	}
}
