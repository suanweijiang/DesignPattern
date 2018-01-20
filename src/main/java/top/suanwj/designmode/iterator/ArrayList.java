package top.suanwj.designmode.iterator;

public class ArrayList implements Collection {

	private Object[] objects = new Object[10];
	private final int INCREMENT = 10;
	private int index = 0;

	public void add(Object obj) {
		if (index == objects.length) {
			Object[] newObjects = new Object[objects.length + INCREMENT];
			System.arraycopy(objects, 0, newObjects, 0, objects.length);
			objects = newObjects;
		}
		objects[index] = obj;
		index++;
	}

	public int size() {
		return index;
	}

	public Object get(int index) {
		return objects[index];
	}

	public Iterator iterator() {
		return new ArrayIterator();
	}

	private class ArrayIterator implements Iterator {

		private int currentIndex = 0;

		public Object next() {

			// if(currentIndex > index - 1) return null;

			return objects[currentIndex++];
		}

		public boolean hasNext() {

			return currentIndex < index;
		}

	}
}
