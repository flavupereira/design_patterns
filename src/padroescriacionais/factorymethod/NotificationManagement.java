package padroescriacionais.factorymethod;

public abstract class NotificationManagement {
	
	public void sendAlert() {
		Notification notification = createNotification();
		
		notification.notifyUser();
		
	}
	
	protected  abstract Notification createNotification();

}
