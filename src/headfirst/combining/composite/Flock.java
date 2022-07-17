package headfirst.combining.composite;

import java.util.*;

public class Flock implements Quackable {
	private List<Quackable> quackers = new ArrayList<Quackable>();
 
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
 
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = (Quackable)iterator.next();
			quacker.quack();
		}
	}
 
	public String toString() {
		return "鳴く鳥の群れ";
	}
}
