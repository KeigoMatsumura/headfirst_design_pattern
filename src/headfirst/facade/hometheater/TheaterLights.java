package headfirst.facade.hometheater;

/**
 * 照明
 */
public class TheaterLights extends HomeElectronics {
	
	public TheaterLights(String description) {
		super(description);
	}
 
	/**
	 * 照明の明るさの変更
	 * @param level 変更レベル
	 */
	public void dim(int level) {
		System.out.println(description + "の明るさを" + level  + "%まで暗くします");
	}
}
