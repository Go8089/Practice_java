package dataStructures;

public class DoublyLL {
	Node head;
	Node tail;
	int size;
	DoublyLL(){
		this.size=0;
	}
public void insertAtFirst(int val) {
	Node node = new Node(val);
	node.next = head;
	node.prev = null;
	if(head != null) {
		head.prev = node;
	}
	head = node;
	if(tail == null) {
		tail = head;
	}
	size++;		
}
public void insertAtLast(int val) {
	//with tail
	/*Node node = new Node(val,tail,null);
	tail.next = node;
	tail = node;*/
	//without tail
	Node index = getIndex(size - 2);
	Node node = new  Node(val,index,null);
	index.next = node;
	size++;
}
public void insertAtSpecificPosition(int val, int index) {
	
}
	

public Node getIndex(int index) {
	Node temp = head;
	for(int i = 1; i <= index; i++) {
		temp = temp.next;
	}
	return temp;
}
public void display() {
	Node temp = head;
	while(temp != null) {
		System.out.print(temp.val + "->");
		temp = temp.next;
	}
	System.out.println("END$S");	
}

public void reverseDoubly() {
	Node temp = tail;
	System.out.print("END$S->");
	do{
		System.out.print(temp.val + "->");
		temp = temp.prev;
	  }while(temp != null);
}
	private class Node{
		Node prev;
		int val;
		Node next;
		Node(int val){
			this.val = val;
		}
		Node(int val, Node prev){
			this.val = val;
			this.prev = prev;
		}
		Node(int val, Node prev, Node next){
			this.val = val;
			this.prev = prev;
			this.next = next;
		}
		Node(Node prev){
			this.prev=prev;
		}
		Node(Node prev, Node next){
			this.prev = prev;
			this.next = next;
		}
	}
}
