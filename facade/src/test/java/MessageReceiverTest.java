
public class MessageReceiverTest {
	public static void main(String[] args) throws Exception {
		MessageReceiver receiver = MessageReceiver.getInstance();

		receiver.attach(new Beeper());
		receiver.attach(new MessagePrinter());

		receiver.acceptMessage("first");
		Thread.sleep(1000);
		receiver.acceptMessage("second message");

		System.out.println(receiver.retriveMessages().size());
	}
}
