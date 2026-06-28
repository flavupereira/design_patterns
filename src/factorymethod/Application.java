package factorymethod;

public class Application {
	
	private static NotificationManagement management;
	
	
	public static void main(String[] args) {
		String userPrefer = "EMAIL";
		
		if(userPrefer.equalsIgnoreCase("EMAIL")) {
			management = new EmailManagement(); 
			
		}else if (userPrefer.equalsIgnoreCase("SMS")) {
			management = new SMSManagement();
		}
		
	     management.sendAlert();
	}

}
