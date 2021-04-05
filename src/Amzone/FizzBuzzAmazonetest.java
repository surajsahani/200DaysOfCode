package Amzone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzzAmazonetest {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		   
		/*Read input*/
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        String number=null;
        int numberInt=0;
    	try{    		
        	number= br.readLine();
        }catch(IOException e){
        	System.out.println("Error reading line"+e);
        	return;
        }
    	try{
    		numberInt = Integer.parseInt(number);
    	}catch(NumberFormatException e){
    		System.out.println("Error parsing line"+e);
        	return;
    	}
    	FizzBuzzAmazonetest sol = new FizzBuzzAmazonetest();
    	sol.countFizzBuzz(numberInt);
    	
    }
	
	public void countFizzBuzz(int number){
		for(int i=1; i<=number; i++){
			boolean fizz=false;
			boolean buzz =false;
			if(i%3==0){
				System.out.print("Fizz");
				fizz=true;
			}if(i%5==0){
				System.out.print("Buzz");
				buzz=true;
			}
			if(!buzz && !fizz){
				System.out.println(i);
			}else{
				System.out.println("");
			}
			
		}
		
	}
}
