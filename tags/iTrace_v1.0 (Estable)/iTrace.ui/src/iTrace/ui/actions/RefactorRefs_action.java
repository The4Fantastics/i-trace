package iTrace.ui.actions;

import iTrace.ui.tools.RefactorRefs;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class RefactorRefs_action implements IObjectActionDelegate {

	
	private ISelection currSelection;
	private IFile currentFile;
	
	@Override
	public void run(IAction action) {
		IStructuredSelection iss = (IStructuredSelection) currSelection;
		currentFile = (IFile) iss.getFirstElement();
		
		new RefactorRefs(currentFile.getFullPath().toString());
		
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		currSelection = selection;
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		
	}

}
