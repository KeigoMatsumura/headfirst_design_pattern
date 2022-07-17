package headfirst.observer.weather;

/**
 * 気象情報の表示
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	/**
	 * 気象状況を更新し、表示する
	 */
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	/**
	 * 気象状況の表示
	 */
	public void display() {
		System.out.println("現在の気象状況: " + temperature 
			+ "度C 湿度" + humidity + "%");
	}
}
