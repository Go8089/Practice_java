package dataStructures;

public class LL {
  private Node head;
  private Node tail;
  private int size;
  LL(){
	  this.size = 0;
  }
  public void insertAtFirst(int val) {
	  Node node = new Node(val);
	  node.next = head;
	  head = node;
	  if(tail == null)
	  {
		 tail = head;
	  }
	  
	  size++;
  }
  public void insertAtLast(int val) {
	  //without tail
	 // Node index = getIndex(size -1);
	  Node node = new Node(val,null);
	 // index.next = node;
	  //with tail;
	  tail.next = node;
	  tail = node;
	  size++;
  }
  public void insertAtSpecificPosition(int index, int val) {
	  if(size == 0 || index == 1) {
		  insertAtFirst(val);
	  }
	  else if(size == index) {
		  insertAtLast(val);
	  }
	  else {
		  Node index1 = getIndex(val -2);
		  Node node = new Node(val, index1.next);
		  index1.next = node;
		  size++;
	  }
  }
  public void display() {
	  Node temp = head;
	  while(temp != null) {
		  System.out.print(temp.val + "->");
		  temp = temp.next;
	  }
	  System.out.print("End");  
  }
  public Node getIndex(int val) {
	  Node temp = head;
	  for(int i = 1; i <= val; i++) {
		  temp = temp.next;
	  }
	  return temp;
  }
 public int deleteAtFirst() {
	 int val = head.val;
	 head = head.next;
	 size--;
	 return val;
 }
 public int deleteAtSpecificPosition(int index) {
	 int val = 0;
	 if(size == 0 || index > size) {
		 return Integer.MIN_VALUE;
	 } else if(index == 1) {
		 deleteAtFirst();
	 } else if(index == size) {
		 deleteAtLast();
	 } else {
		 Node index1 = getIndex(index - 2);
		 val = index1.val;
		 index1.next = index1.next;
		 size--;
	 }
	 return val;
 }
 public int deleteAtLast() {
	 // with tail
	 int val = tail.val;
	 Node index = getIndex(size - 2);
	 index.next = null;
	 tail = index;
	 size--;
	 return val; 
 }
 public int updateAtFirst(int val) {
	 int val1 = head.val;
	 head.val = val;
	 return val1;
 }
 public int updateAtLast(int val) {
	 int val1 = tail.val;
	 tail.val = val;
	 return val1;
 }
 public int updateAtSpecificPosition(int val, int index) {
	 int val1 = 0;
	 if(size == 0 || index > size) {
		 return Integer.MIN_VALUE;
	 } else if(index == 1) {
		 updateAtFirst(val);
	 } else if(index == size) {
		 updateAtLast(val);
	 } else {
		 Node nodestore =getIndex(index - 1);
		 val1 = nodestore.val;
		 nodestore.val = val;
	 }
	 
	 return val1;
 }
 public void reverseSinglyLL() {
	 Node temp = head;
	 
 }
	private class Node{
		int val;
		Node next;
		Node(int val){
			this.val = val;
		}
		Node(int val, Node next){
			this.val = val;
			this.next = next;
		}
	}
}

 

