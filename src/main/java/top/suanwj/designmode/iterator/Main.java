package top.suanwj.designmode.iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		for (int i = 0; i < 15; i++) {
			al.add(new Cat(i));
		}
		System.out.println(al.size());
	}
	
}
