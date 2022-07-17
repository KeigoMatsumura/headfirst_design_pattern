package headfirst.singleton.classic;

// 注意：これはスレッドセーフではない！

public class Singleton {
	private static Singleton uniqueInstance;
 
	// 必要があれば、ここにフィールド変数を
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// 必要があれば、ここにメソッドを
}
