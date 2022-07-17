package headfirst.facade.hometheater;

/**
 * 家電クラス
 */
public class HomeElectronics extends Furniture {
	
	public HomeElectronics(String description) {
		super(description);
	}
 
	public void on() {
		System.out.println(description + "をスイッチオン");
	}
 
	public void off() {
		System.out.println(description + "をスイッチオフ");
	}
}
