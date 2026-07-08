package padroescriacionais.factorymethod;

public class SMSManagement extends NotificationManagement {

	@Override
	protected Notification createNotification() {
		// TODO Auto-generated method stub
		return new SMSNotification();
	}

}
