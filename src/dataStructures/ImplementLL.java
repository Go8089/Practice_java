package dataStructures;

public class ImplementLL {

	public static void main(String[] args) {
		/*LL l1 = new LL();
		l1.insertAtFirst(32);
		l1.insertAtFirst(8089);
		l1.insertAtFirst(2006);
		l1.insertAtFirst(1954);
		l1.insertAtLast(8089);
		l1.insertAtLast(89);
		l1.insertAtSpecificPosition(8089, 3);
		int val = l1.deleteAtSpecificPosition(45);
		System.out.println(val);
		l1.display();
		int val1 = l1.updateAtFirst(22);
		System.out.println(val1);
		int val2 = l1.updateAtLast(22);
		System.out.println(val2);
		l1.display();*/
		DoublyLL l1 = new DoublyLL();
		l1.insertAtFirst(8089);
		l1.insertAtFirst(80);
		l1.insertAtFirst(89);
		l1.insertAtLast(22);
		l1.insertAtLast(21);
		l1.display();
		l1.reverseDoubly();

	}

}
