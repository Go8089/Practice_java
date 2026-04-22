package dataStructures;

public class ImplementStack {

	public static void main(String[] args) throws Exception {
		CustomStack stack = new CustomStack();
		stack.push(8089);
		stack.push(80);
		stack.push(89);
		stack.push(2006);
		stack.push(20);
		int run = stack.ptr;
		System.out.println(stack.peek());
		while(run != -1) {
			int val = stack.pop();
			System.out.print(val + " ");
			run--;
		}
		
	}

}
