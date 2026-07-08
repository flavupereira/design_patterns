package padroescriacionais.factorymethod;

public class EmailManagement extends NotificationManagement {

	@Override
	protected Notification createNotification() {
		
		return new EmailNotification();
	}

}
