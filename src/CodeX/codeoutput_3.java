package CodeX;

public class codeoutput_3 {
	public static void main(String []args) {
		int a =1, b=10, c=1;
		if(((a & b ) > 0 || 0 > 0) || (a > 0  && c > 0 && 0 >0)) {
			a = a +c;
			b = b%3;
		}
		a = a<<1;
		System.out.println(a+b-c);
	}
}
