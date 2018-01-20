package top.suanwj.designmode.iterator;

public interface Collection {
	void add(Object obj);
	int size();
	Iterator iterator();
	
	Object get(int index);
}
