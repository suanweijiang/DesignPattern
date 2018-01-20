package top.suanwj.designmode.strategy;

public class DataSorter {

	// 冒泡排序
	public static void bubbleSort(int[] ints) {
		for (int i = 0; i < ints.length; i++) {
			for (int j = i; j < ints.length; j++) {
				if (ints[i] > ints[j]) {
					swap(ints, i, j);
				}
			}
		}

	}

	private static void swap(int[] ints, int i, int j) {
		int temp;
		temp = ints[i];
		ints[i] = ints[j];
		ints[j] = temp;
	}

}
