package edu.fudan.ss.ooad.eclipse.views;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.part.ViewPart;

import edu.fudan.ss.ooad.eclipse.core.ICourseEvaluationManager;

public class CoursesView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "edu.fudan.ss.ooad.eclipse.views.CoursesView";

	private TreeViewer viewer;

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	@Override
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.H_SCROLL | SWT.V_SCROLL);
		
		viewer.setLabelProvider(new CourseLabelProvider());
		viewer.setContentProvider(new CourseContentProvider());
		viewer.setInput(ICourseEvaluationManager.INSTANCE);

		getSite().setSelectionProvider(viewer);
		hookContextMenu();
	}
	
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		
		getSite().registerContextMenu(menuMgr, viewer);
	}
}