package infytq;

public class Quiz {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.addAtEnd("Milan");
		list.addAtEnd("Venice");
		list.addAtEnd("Munich");
		list.addAtEnd("Prague");
		list.addAtEnd("Vienna");
		list.display();
		System.out.println("--------------------");
		list.delete("Venice");
		list.display();
	}
	
}
