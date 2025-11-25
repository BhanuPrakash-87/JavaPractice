package solidViolated;

public class NotificationService1 {

	SendSMS sms; // Direct dependency on a concrete low-level module

	public NotificationService1(SendSMS sms) {
		super();
		this.sms = sms;
	}
	
	void send () {
		sms.sendNotification();
	}
}
