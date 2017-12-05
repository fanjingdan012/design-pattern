package uiwidget;

import uiwidget.motif.MotifWidgetFactory;
import uiwidget.pm.PMWidgetFactory;

public abstract class WidgetFactory {

	private static WidgetFactory minstance = new MotifWidgetFactory();
	private static WidgetFactory pinstance = new PMWidgetFactory();

	public abstract IWindow createWindow();

	public abstract IScrollBar createScrollBar();

	public static WidgetFactory getInstance() {
		return minstance;
	}

}
