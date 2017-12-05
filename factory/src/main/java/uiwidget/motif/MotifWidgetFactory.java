package uiwidget.motif;

import uiwidget.IScrollBar;
import uiwidget.IWidgetFactory;
import uiwidget.IWindow;
import uiwidget.WidgetFactory;

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
