
public class Queue {

	private Customer first, last;

	public Queue() {
		first = last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void enqueue(Customer c) {
		if (isEmpty()) {
			first = last = c;
		} else {
			last.setNext(c);
			last = c;
		}
	}

	public Customer dequeue() {
		if (isEmpty()) {
			System.out.println("The list is currently empty. There's nothing to be removed");
			return null;
		}

		Customer temp = first;

		first = first.getNext();

		if (first == null) {
			last = null;
		}
		return temp;
	}

	public void examineLine() {
		Customer c = first;

		while (c != null) {
			System.out.println(c);

			c = c.getNext();
		}
	}

	public Customer getFirst() {
		return first;
	}

}
