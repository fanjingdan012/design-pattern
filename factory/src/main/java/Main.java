

import uiwidget.IWidgetFactory;
import uiwidget.IWindow;
import uiwidget.WidgetFactory;

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
