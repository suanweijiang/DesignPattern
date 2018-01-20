package top.suanwj.designmode.iterator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Cat {

	@Getter @Setter private int id;
	
	public Cat(int id) {
		this.id = id;
	}
	
}
