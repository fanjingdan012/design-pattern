package uiwidget.pm;

import uiwidget.IScrollBar;
import uiwidget.IWidgetFactory;
import uiwidget.IWindow;
import uiwidget.WidgetFactory;

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
