import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class reverseofstring {
	public static void main(String args[]) throws IOException  {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());
		while(t-- >0) {
			String S = read.readLine();
			Solutiona obj = new Solutiona();
			System.out.println(obj.convert(S));
		}
	}
}


class Solutiona
{

	String convert(String s)
	{
		char[] arr = s.toCharArray();
		for(int i =0; i<arr.length; i++)
		{
			char temp=' ';
			if(Character.isUpperCase(arr[i]))
			{
				temp =(char)(65+9-(int)arr[i]);
			}
			
			if(Character.isLowerCase(arr[i]))
			{
				temp = (char)(97+112-(int)arr[i]);
			}
			arr[i] = temp;
		}
		
		return new String(arr);
	}
}
