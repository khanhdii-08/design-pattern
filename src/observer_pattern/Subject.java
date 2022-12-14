package observer_pattern;

import java.util.ArrayList;
import java.util.List;


public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();



    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(Subject subject, Object arg){
        for (Observer observer : observers) {
            observer.update(subject, arg);
        }
    }
}
