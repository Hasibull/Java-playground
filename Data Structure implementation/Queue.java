import java.util.*;

class Queue{

	private static int pointer = 0;
	private static int[] queue = new int[Integer.MAX_VALUE];

	public static void push(int value) {
		queue[pointer++] = value;
	}

	public static int top() {
		return queue[pointer];
	}

	public static void pop() {
		pointer--;
	}
}
