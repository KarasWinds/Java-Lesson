
public class Stack {
	private int num;
	private int[] stack;
	private int top;

	Stack(int num) {
		this.num = num;
		stack = new int[num];
	}

	public void push(int n) {
		try {
			if (top >= stack.length) {
				throw new StackFullException();
			}
			stack[top] = n;
		} catch (StackFullException e) {
			System.out.println(e.msg);
		}
		top++;
	}

	public int getNum() {
		return num;
	}

	public int pop() {
		int a = 0;
		try {
			if (top <= 0) {
				throw new StackEmptyException();
			}
			a = stack[top - 1];
		} catch (StackEmptyException e) {
			System.out.println(e.msg);
			a = 0;
		}
		top--;
		return a;
	}

}
