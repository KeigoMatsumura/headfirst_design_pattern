package headfirst.singleton.chocolate;
 
public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance;
  
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
  
	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			System.out.println("チョコレートボイラの唯一のインスタンスを作ります");
			uniqueInstance = new ChocolateBoiler();
		}
		System.out.println("チョコレートボイラのインスタンスを返します");
		return uniqueInstance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// 牛乳とチョコレートの混合液でボイラを満たす
		}
	}
 
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// 沸騰した牛乳とチョコレートの混合液を
			empty = true;
		}
	}
 
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// 中身を沸騰させる
			boiled = true;
		}
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
}
