package designpattern.abstractfactory.uiwidget.pm;

import designpattern.abstractfactory.uiwidget.IWindow;

public class PMWindow implements IWindow {

	@Override
	public void draw() {
		System.out.println("PM Window");

	}

}
