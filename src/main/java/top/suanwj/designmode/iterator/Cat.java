package top.suanwj.designmode.iterator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class Cat {

	@Getter @Setter private int id;
	
	public Cat(int id) {
		this.id = id;
	}
	
}
