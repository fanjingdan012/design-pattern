
public class MessagePrinter implements IMessageListener{
	public void printMessage(String message) {
		System.out.println(message);
	}

	@Override
	public void messageAccepted(String message) {
		printMessage(message);
		
	}

}
