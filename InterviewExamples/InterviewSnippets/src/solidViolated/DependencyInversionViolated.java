package solidViolated;

public class DependencyInversionViolated {

	public static void main(String[] args) {
		
		SendEmail email = new SendEmail();
		NotificationService service = new NotificationService(email);
		service.send();
		
		SendSMS sms = new SendSMS();
		NotificationService1 service1 = new NotificationService1(sms);
		service1.send();
	}
}
