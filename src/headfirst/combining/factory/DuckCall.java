package headfirst.combining.factory;

public class DuckCall implements Quackable {
 
	public void quack() {
		System.out.println("ガアガア");
	}
 
	public String toString() {
		return "鴨笛";
	}
}
