package solid;

public class DIPExample {

	public static void main(String[] args) {
		// Using Email Sender
		MessageSender emailSender = new EmailSender();
		NotificationService emailService = new NotificationService(emailSender);
		emailService.notification();
		
		// Using SMS Sender
	}
}
