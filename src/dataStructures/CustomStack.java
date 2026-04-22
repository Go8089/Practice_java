package dataStructures;

public class CustomStack {
 protected int[] data;
 private static final int DefaultSize = 10;
 int ptr = -1;
 public CustomStack() {
	 this(DefaultSize);
 }
 public CustomStack(int size) {
	this.data = new int[size];
}
 public void push(int item) {
	 if(isFull()) {
		 return;
	 }
	 ptr++;
	 data[ptr]=item;
	 return;
 }
 public int pop() throws Exception {
	 if(isEmpty()) {
		 throw new Exception("empty");
	 }
	 return data[ptr--];
 }
 public int peek() throws Exception {
	 if(isEmpty()) {
		 throw new Exception("stack is empty");
	 }
	 return data[ptr];
 }
 private boolean isFull() {
	 return ptr == data.length - 1;
 }
 private boolean isEmpty() {
	 return ptr == -1;
 }
}
