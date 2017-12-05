package designpattern.observer;

import java.awt.Toolkit;

public class Beeper implements IMessageListener{
	public void beep() {
		Toolkit.getDefaultToolkit().beep();
	}

	@Override
	public void messageAccepted(String message) {
		beep();
	}

}
