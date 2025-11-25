package solid;

public class NotificationService {

	private final MessageSender messageSender;

	public NotificationService(MessageSender messageSender) {
		this.messageSender = messageSender;
	}
	
	public void notification () {
		messageSender.sendNotification();
	}
}
