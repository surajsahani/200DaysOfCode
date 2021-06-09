
public class Mainb {
	  
	// Driver Class
	    public static void main(String args[])
	    {
	        // instantiating Singleton class with variable x
	        singleton x = singleton.getInstance();
	  
	        // instantiating Singleton class with variable y
	        singleton y = singleton.getInstance();
	  
	        // instantiating Singleton class with variable z
	        singleton z = singleton.getInstance();
	  
	        // changing variable of instance x
	        x.s = (x.s).toUpperCase();
	  
	        System.out.println("String from x is " + x.s);
	        System.out.println("String from y is " + y.s);
	        System.out.println("String from z is " + z.s);
	        System.out.println("\n");
	  
	        // changing variable of instance z
	        z.s = (z.s).toLowerCase();
	  
	        System.out.println("String from x is " + x.s);
	        System.out.println("String from y is " + y.s);
	        System.out.println("String from z is " + z.s);
	    }
}
