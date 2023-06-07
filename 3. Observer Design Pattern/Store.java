import Observable.IphoneObservable;
import Observable.SlotsObservable;
import Observer.MobileAlertObserverImpl;
import Observer.NotificationAlertObserver;

public class Store {
    public static void main(String args[]){
        SlotsObservable iphoneStockObservable = new IphoneObservable();

        NotificationAlertObserver observer1 = new MobileAlertObserverImpl("nagpal8795@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("tusharnagpal.5656@gmail.com", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);

        iphoneStockObservable.setStockCount(10);
    }
}
