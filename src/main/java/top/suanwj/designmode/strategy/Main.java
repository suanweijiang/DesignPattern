package top.suanwj.designmode.strategy;

/**
 * 策略模式 Strategy
 * @author suanwj
 *
 */
public class Main {
	public static void main(String[] args) {
		int[] ints = new int[] {3, 2, 4, 1, 6, 8, 10, 23};
		DataSorter.bubbleSort(ints);
		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
	}
}
