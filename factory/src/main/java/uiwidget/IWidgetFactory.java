package uiwidget;

import uiwidget.motif.MotifWidgetFactory;

public interface IWidgetFactory {

	IWidgetFactory INSTANCE = new MotifWidgetFactory();

	public abstract IWindow createWindow();

	public abstract IScrollBar createScrollBar();

}
