package pro11;


public class Stack implements StackOperation{
	private static int[] stk;
	public static int top;

	public Stack(int size) {
		super();
		this.stk = new int[size];
		this.top = -1;
	}

	private boolean isFull() {
		return top == stk.length - 1;

	}

	private boolean isEmpty() {
		return top == -1;

	}

	@Override
	public int push(int data) {
		if (!isFull()) {

			stk[++top] = data;
			return 1;

		} else {
			return 0;
		}

	}
	@Override
	public int pop() {
		
		if (!isEmpty()) {
			return stk[top--];


		} else {
			return 0;
		}
	}
	@Override
	public int[] desplay(){
		
		return stk;
	}
}
