package top.suanwj.designmode.iterator;

public class ArrayList {

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
		index ++;
	}
	
	public int size() {
		return index;
	}

}
