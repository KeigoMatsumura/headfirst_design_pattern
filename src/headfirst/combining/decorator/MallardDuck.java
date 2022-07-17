package headfirst.combining.decorator;

public class MallardDuck implements Quackable {
 
	public void quack() {
		System.out.println("ガーガー");
	}
 
	public String toString() {
		return "マガモ";
	}
}
