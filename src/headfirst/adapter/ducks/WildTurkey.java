package headfirst.adapter.ducks;

/**
 * 野生の七面鳥です
 */
public class WildTurkey implements Turkey {
	public void gobble() {
		System.out.println("ゴホゴホ");
	}
 
	public void fly() {
		System.out.println("ちょっとだけ飛んでいます");
	}
}
