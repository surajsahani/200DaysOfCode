package infytq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CashRegister {
	
	public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);
        try {
            // Initialise cash register.
        	CashRegister cashRegister = new CashRegister();
            cashRegister.init();

            double purchasePrice = Double.parseDouble(in.readLine());
            double cash = Double.parseDouble(in.readLine());

            // Calculate change.
            String result = cashRegister.calculateChange(purchasePrice, cash);
            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
	
    public class Coin {

        double value;
        String name;

        public Coin(double value, String name) {
            this.value = value;
            this.name = name;
        }

        public double getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
    }
	
	    LinkedHashSet<Coin> coins = new LinkedHashSet<>();

	    public String calculateChange(double purchasePrice, double cash) {

	        double cashBack = cash - purchasePrice;

	        if (cashBack < 0) {
	            System.out.println("ERROR");
	            return "";
	        }

	        StringBuilder change = new StringBuilder();

	        while (cashBack > 0) {
	            Iterator<Coin> iterator = coins.iterator();
	            while (iterator.hasNext()) {
	                Coin coin = iterator.next();
	                int count = 0;
	                while (cashBack >= coin.getValue()) {
	                    count++;
	                    cashBack -= coin.getValue();
	                }
	                if (count > 0) {
	                    change.append(count).append(" " + coin.getName());
	                    change.append("\n");
	                }
	            }
	        }
	        return change.toString();
	    }

	    public LinkedHashSet<Coin> init() {
	        coins.add(new Coin(50, "Fifty Pound"));
	        coins.add(new Coin(20, "Twenty Pound"));
	        coins.add(new Coin(10, "Ten Pound"));
	        coins.add(new Coin(5, "Five Pound"));
	        coins.add(new Coin(2, "Two Pound"));
	        coins.add(new Coin(1, "One Pound"));
	        coins.add(new Coin(0.5, "Fifty Pence"));
	        coins.add(new Coin(0.2, "Twenty Pence"));
	        coins.add(new Coin(0.1, "Ten Pence"));
	        coins.add(new Coin(0.05, "Five Pence"));
	        coins.add(new Coin(0.02, "Two Pence"));
	        coins.add(new Coin(0.01, "One Pence"));
	        return coins;
	    }
	}


