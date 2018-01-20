package top.suanwj.designmode.iterator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Entry {
	
	public Entry(Object element, Entry next) {
		this.element = element;
		this.next = next;
	}
	
	// 元素本身
	@Getter @Setter private Object element;
	// 下个元素
	@Getter @Setter private Entry next;
	// 上个元素
	@Getter @Setter private Entry previous;
		
}
