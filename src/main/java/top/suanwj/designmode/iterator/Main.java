package top.suanwj.designmode.iterator;

/**
 * Iterator 迭代器
 * @author suanwj
 *
 */
public class Main {

	public static void main(String[] args) {
		Collection ca = new ArrayList();
		for (int i = 0; i < 3; i++) {
			ca.add(new Cat(i));
		}
		Iterator ita = ca.iterator();
		while (ita.hasNext()) {
			System.out.println(ita.next());
		}
		System.out.println(ca.size());
		
		Collection cl = new LinkedList();
		
		for (int i = 0; i < 5; i++) {
			cl.add(new Cat(i));
		}
		
		Iterator itl = cl.iterator();
		while (itl.hasNext()) {
			System.out.println(itl.next());
		}
		System.out.println(cl.size());
	}
	
}
