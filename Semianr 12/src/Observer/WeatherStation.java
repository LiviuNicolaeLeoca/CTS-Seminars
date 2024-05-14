package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private final List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherStation()
    {
        this.observers=new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers)
            observer.update(temperature, humidity, pressure);
    }

    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        notifyObservers();
    }
}
