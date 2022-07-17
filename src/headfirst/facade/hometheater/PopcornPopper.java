package headfirst.facade.hometheater;

/**
 * ポップコーン製造機
 */
public class PopcornPopper extends HomeElectronics {
	
	public PopcornPopper(String description) {
		super(description);
	}

	public void pop() {
		System.out.println(description + "がポップコーンを作っています！");
	}
}
