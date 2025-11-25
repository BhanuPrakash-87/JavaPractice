package solid;

//Low-level module: Concrete implementation of the abstraction
public class SMSSender implements MessageSender {

	@Override
	public void sendNotification() {
		System.out.println("Sending SMS...");
	}
}
