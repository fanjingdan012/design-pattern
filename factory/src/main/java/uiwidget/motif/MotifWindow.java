package designpattern.abstractfactory.uiwidget.motif;

import designpattern.abstractfactory.uiwidget.IWindow;

public class MotifWindow implements IWindow {

	@Override
	public void draw() {
		System.out.println("Motif window");

	}

}
