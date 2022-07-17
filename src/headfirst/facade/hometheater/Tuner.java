package headfirst.facade.hometheater;

public class Tuner extends HomeElectronics {
	private Amplifier amplifier;
	private double frequency;
	
	public Tuner(String description, Amplifier amplifier) {
		super(description);
		this.amplifier = amplifier;
	}
	
	public Amplifier getAmplifier() {
		return amplifier;
	}

	/**
	 * フリークエンシーの設定
	 * @param frequency  フリークエンシー
	 */
	public void setFrequency(double frequency) {
		System.out.println(description + "のフリークエンシーを" + frequency + "に設定");
		this.frequency = frequency;
	}
	
	public double getFrequency() {
		return frequency;
	}
 
	/**
	 * AMモードに設定
	 */
	public void setAm() {
		System.out.println(description + "をAMモードに設定");
	}

	/**
	 * FMモードに設定
	 */
	public void setFm() {
		System.out.println(description + "をFMモードに設定");
	}
}
