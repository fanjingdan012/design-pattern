package designpattern.abstractfactory.uiwidget.pm;

import designpattern.abstractfactory.uiwidget.IScrollBar;

public class PMScrollBar implements IScrollBar {

	@Override
	public void draw() {
		System.out.println("motif scrollbar");

	}

}
