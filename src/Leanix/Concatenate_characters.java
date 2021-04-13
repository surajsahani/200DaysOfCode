package Leanix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Concatenate_characters {
	
	    public static void main(String[] args)
	    throws IOException
	    {
	    	// Enter data using BufferReader
	    	BufferedReader reader = new BufferedReader(
	    			new InputStreamReader(System.in));
	    	
	    	// Reading data using readLine
	    	String name = reader.readLine();
	    	
	    	// printing the read line
	    	System.out.println(name);
	    	
	    }
}

