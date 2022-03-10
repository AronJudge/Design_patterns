package ObserverModel.Byself.Subject;

import ObserverModel.Byself.Observer.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
