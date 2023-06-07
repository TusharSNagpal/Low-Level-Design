package Observable;

import Observer.NotificationAlertObserver;

public interface SlotsObservable {

    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int newSlotAdded);
    public int getStockCount();

    // Let's say we have five customers for juicer and five customers for iphone:
    // So we will create separate Observables and separate list of subscribers for each.
}