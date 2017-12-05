package designpattern.observer;

import java.util.ArrayList;
import java.util.Collection;

public class Subject {

	Collection<IMessageListener> listeners = new ArrayList<IMessageListener>();

	public Subject() {
		super();
	}

	protected void notifyMessageAccepted(String message) {
		for(IMessageListener listener : listeners){
			listener.messageAccepted(message);
		}
	}

	public void attach(IMessageListener listener) {
		listeners.add(listener);
	}

}