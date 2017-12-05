
import java.util.ArrayList;
import java.util.Collection;

public class MessageReceiver extends Subject {
	
	private static MessageReceiver instance = new MessageReceiver();
	public static MessageReceiver getInstance(){
		return instance;
	}
	
	protected MessageReceiver(){
		
	}

	private Collection<String> messages = new ArrayList<String>();

	public void acceptMessage(String message) {
		messages.add(message);
		notifyMessageAccepted(message);
	}

	public Collection<String> retriveMessages() {
		//notifyMessageRetrived();
		return messages;
	}
}
