package designpattern.abstractfactory.uiwidget.pm;

import designpattern.abstractfactory.uiwidget.IScrollBar;
import designpattern.abstractfactory.uiwidget.IWidgetFactory;
import designpattern.abstractfactory.uiwidget.IWindow;
import designpattern.abstractfactory.uiwidget.WidgetFactory;

public class PMWidgetFactory extends WidgetFactory implements IWidgetFactory {

	@Override
	public IScrollBar createScrollBar() {
		return new PMScrollBar();
	}

	@Override
	public IWindow createWindow() {
		return new PMWindow();
	}

}
