package Amzone;

import java.util.Scanner;

public class FizzBuzzNnumber {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        
        int number = in.nextInt();
        
        
        for(int i = 1; i<number+1; i++){
            String tempStr="";
            
            if(checkMultiples3(i)){
                tempStr+="Fizz";
            }
            if(checkMultiples5(i)){
                tempStr+="Buzz";
            }
            if(tempStr.isEmpty()){
                tempStr=String.valueOf(i);
            }
            System.out.println(tempStr);
        }
    }

    static boolean checkMultiples3(int n){
        if(n%3==0)
            return true;
        return false;
    }
    
    static boolean checkMultiples5(int n){
        if(n%5==0)
            return true;
        return false;
    }
}

    