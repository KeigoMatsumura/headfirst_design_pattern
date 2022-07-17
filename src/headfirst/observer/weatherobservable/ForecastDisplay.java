package headfirst.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;

	public ForecastDisplay(Observable observable) {
		observable.addObserver(this);
	}

	public void update(Observable observable, Object arg) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)observable;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}

	public void display() {
		System.out.print("予報: ");
		if (currentPressure > lastPressure) {
			System.out.println("天候は良くなります！");
		} else if (currentPressure == lastPressure) {
			System.out.println("ほとんど同じです");
		} else if (currentPressure < lastPressure) {
			System.out.println("より寒く雨模様の天候に注意してください");
		}
	}
}
