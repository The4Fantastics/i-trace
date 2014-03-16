package iTrace.ui.transformations.launchs.MXML2KDM;

import java.io.File;

import iTrace.ui.tools.Message;
import iTrace.ui.transformations.Transformations;

import javax.swing.JOptionPane;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

public class MXML2KDM_LaunchConfigurationDelegate implements
ILaunchConfigurationDelegate {
	
	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {

//		try {
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//		} catch (Exception e1) {
//			;
//		}		
		
		if (monitor == null)
			monitor = new NullProgressMonitor();		
		
		monitor.beginTask("Launching transformation", 100);
		monitor.subTask("Getting configuration info");
		
		
	//	String uri_IN = getINAtt(configuration);
	//	String uri_OUT = getOUTAtt(configuration);
		
		String IN = getINAtt(configuration);
		File fIN=new File(IN);
		String uri_IN=fIN.toURI().toString();
		String OUT = getOUTAtt(configuration);
		File fOUT=new File(OUT);
		String uri_OUT=fOUT.toURI().toString();
		
		monitor.worked(10);
		
		if (monitor.isCanceled()) 
			return;
		
		monitor.subTask("Executing transformation");
		
		try{
			Transformations transf = Transformations.getInstance();
			transf.MOFScript2iTrace(uri_IN, uri_OUT);
			monitor.worked(85);		
			
			if(monitor.isCanceled())
				return;
			
		}catch (Exception e){
			JOptionPane.showMessageDialog(null, "One or more models cannot be found.\nPlease, check your Launch Configuration", "Problems Launching...", JOptionPane.ERROR_MESSAGE);
		}
		
		monitor.subTask("Transformation finished");
		ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IFolder.DEPTH_INFINITE, null);
		
		monitor.done();
		
	}
	
	private String getINAtt(ILaunchConfiguration configuration) throws CoreException
	{
		return getTransformationAtt(configuration, MXML2KDM_Constants.ATTR_TRANSFORMATION_IN);
	}
	
		
	private String getOUTAtt(ILaunchConfiguration configuration) throws CoreException
	{
		return getTransformationAtt(configuration, MXML2KDM_Constants.ATTR_TRANSFORMATION_OUT);
	}
	
	private String getTransformationAtt(ILaunchConfiguration configuration,String id) throws CoreException{
		
		String returned = null;

		returned = configuration.getAttribute(id, (String)null);

		return returned;
	}


}
