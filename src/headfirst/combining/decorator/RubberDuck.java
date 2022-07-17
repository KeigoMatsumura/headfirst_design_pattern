package headfirst.combining.decorator;

public class RubberDuck implements Quackable {
 
	public void quack() {
		System.out.println("キューキュー");
	}
  
	public String toString() {
		return "ゴムのアヒル";
	}
}
