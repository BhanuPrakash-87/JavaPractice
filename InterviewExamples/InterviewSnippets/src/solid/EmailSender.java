package solid;

//Low-level module: Concrete implementation of the abstraction
public class EmailSender implements MessageSender {

	@Override
	public void sendNotification() {
		System.out.println("Sending email...");
	}
}
