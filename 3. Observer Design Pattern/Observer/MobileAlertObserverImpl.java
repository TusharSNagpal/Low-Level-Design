package Observer;
import Observable.SlotsObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String emailId;
    SlotsObservable observable;

    //Constructor Injection:
    public MobileAlertObserverImpl(String emailId, SlotsObservable observable){
        this.observable = observable;
        this.emailId = emailId;
    }
    @Override
    public void update(){
        sendMail(emailId, "Product in Stock. Hurry Up..!");
    }

    private void sendMail(String emailId, String alert){
        System.out.println("Mail Sent to : " + emailId + "." + alert);
    }
}
