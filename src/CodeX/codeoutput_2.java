package CodeX;

public class codeoutput_2 {
	public static void main(String []args) {
		int n = 10;
		int ans = 0;
		while(n > 1) {
			ans += n&1;
			n = n>>1;
		}
		System.out.println(ans);
	}
}
