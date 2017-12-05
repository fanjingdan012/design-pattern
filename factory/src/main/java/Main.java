package designpattern.abstractfactory;

import designpattern.abstractfactory.uiwidget.IWidgetFactory;
import designpattern.abstractfactory.uiwidget.IWindow;
import designpattern.abstractfactory.uiwidget.WidgetFactory;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		IWidgetFactory factory = IWidgetFactory.INSTANCE;
		
		IWindow window = factory.createWindow();
		window.draw();
	}

}
