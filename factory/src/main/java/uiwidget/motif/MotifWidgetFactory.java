package designpattern.abstractfactory.uiwidget.motif;

import designpattern.abstractfactory.uiwidget.IScrollBar;
import designpattern.abstractfactory.uiwidget.IWidgetFactory;
import designpattern.abstractfactory.uiwidget.IWindow;
import designpattern.abstractfactory.uiwidget.WidgetFactory;

public class MotifWidgetFactory extends WidgetFactory implements IWidgetFactory{

	@Override
	public IScrollBar createScrollBar() {
		return new MotifScrollBar();
	}

	@Override
	public IWindow createWindow() {
		return new MotifWindow();
	}

}
