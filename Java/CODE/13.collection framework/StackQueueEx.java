import java.util.*;

public class StackQueueEx {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();

		st.push(1);
		st.push(2);
		st.push(3);

		q.offer(1);
		q.offer(2);
		q.offer(3);

		System.out.println("STACK");
		while (!st.isEmpty())
			System.out.println(st.pop());

		System.out.println("QUEUE");
		while (!q.isEmpty())
			System.out.println(q.poll());

	}

}
