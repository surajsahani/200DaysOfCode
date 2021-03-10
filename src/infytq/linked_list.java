package infytq;

class Node{
	private String data;
	private Node next;
	
	public Node(String data) {
		this.data=data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void setNext(Node node) {
		this.next = node;
	}
	public Node getNext() {
		return this.next;
	}
}
class LinkedList {
	private Node head;
	private Node tail;
	
	public Node getTail() {
		return this.tail;
	}
	public void addAtEnd(String data) {
		//Create a new node
		Node node = new Node(data);
		
		//Check if the list is empty,
		//if yes, make the node as the head and ten tail
		if(this.head == null)
			this.head=this.tail=node;
		else {
			//If the list is not empty, add the element at the end
			this.tail.setNext(node);
			//Make the new node as the tail
			this.tail=node;
		}
	}
	
	public void addAtBegining(String data) {
		//Implement your code here
	}
}
public class linked_list {

	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.addAtEnd("Milan");
		list.addAtEnd("Venice");
		list.addAtEnd("Munich");
		list.addAtBegining("Nice");
	}
}
