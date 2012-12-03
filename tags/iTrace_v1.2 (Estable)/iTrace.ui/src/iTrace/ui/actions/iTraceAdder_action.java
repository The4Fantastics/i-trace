package iTrace.ui.actions;

import iTrace.ui.tools.iTraceAdder;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class iTraceAdder_action implements IObjectActionDelegate {

	
	private static ISelection currSelection;
	private static IFile currentFile;
	
	public iTraceAdder_action() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run(IAction action) {

		//MeasureTime time = new MeasureTime();
		//time.start();
		IStructuredSelection iss = (IStructuredSelection) currSelection;
		currentFile = (IFile) iss.getFirstElement();
		
		try {
			new iTraceAdder(currentFile.getLocation().toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		currSelection = selection;
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		
	}
}
