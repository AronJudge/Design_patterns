package ObserverModel.Byself.Observer;

import ObserverModel.Byself.Subject.Subject;

public class ForecastDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private Subject weatherData;


    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("show pre-weather  " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
