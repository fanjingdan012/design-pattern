package designpattern.abstractfactory.uiwidget.motif;

import designpattern.abstractfactory.uiwidget.IScrollBar;

public class MotifScrollBar implements IScrollBar {

	@Override
	public void draw() {
		System.out.println("PM scrollbar");
	}

}
