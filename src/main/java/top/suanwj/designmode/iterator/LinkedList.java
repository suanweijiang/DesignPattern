package top.suanwj.designmode.iterator;

public class LinkedList implements Collection {

	private int index = 0;
	
	private Entry head = null;// 第一个元素
	
	private Entry tail = null;// 最后一个元素
		
	private Entry next = null;// 下个元素
	
	private Entry previous = null;// 上个元素
	
	public void add(Object obj) {
		// 这种方法也是可以
//		Entry current = new Entry(obj, next);
//		if (head == null) {
//			head = current;
//			tail = current;
//		}
//		tail.setNext(current);
//		tail = current;
//		index ++;
		
//		Entry current = new Entry(obj, next, previous);
		Entry current = new Entry(obj, next);
		if (head == null) {
			head = current;
		}
		if (tail != null) {
			tail.setNext(current);
		}
		tail = current;
		index ++;
		
	}
	
	public int size() {
		return index;
	}

	public Object get(int index) {
		Entry entry = head;
		while (index-- > 0) {
			entry = entry.getNext();
		}		
		return entry.getElement();
	}

	public Iterator iterator() {
		return new LinkedIterator();
	}
	
	private class LinkedIterator implements Iterator {
		
		private Entry currentEntry = head;
		
		public Object next() {
			Object obj = currentEntry == null ? null : currentEntry.getElement();
			currentEntry = currentEntry.getNext();
			return obj;
		}

		public boolean hasNext() {
			return currentEntry != null;
		}
		
	}
	
	
}