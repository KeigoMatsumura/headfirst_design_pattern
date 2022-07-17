package headfirst.singleton.chocolate;
 
public class ChocolateController {
	public static void main(String args[]) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		// 既に作られたインスタンスが返るはず
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
	}
}
