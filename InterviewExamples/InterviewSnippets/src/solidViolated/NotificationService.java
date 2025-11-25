package solidViolated;

// High-Level Class
public class NotificationService {

	SendEmail email; // Direct dependency on a concrete low-level module

	public NotificationService(SendEmail email) {
		this.email = email;
	}
	
	void send() {
		email.sendNotification();
	}
}
