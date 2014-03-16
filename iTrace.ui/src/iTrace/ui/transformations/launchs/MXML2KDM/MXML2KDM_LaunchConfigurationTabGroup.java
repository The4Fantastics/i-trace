package iTrace.ui.transformations.launchs.MXML2KDM;

import iTrace.ui.transformations.launchs.MOFScript2iTrace.MOFScript2iTrace_LaunchConfigurationTab;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class MXML2KDM_LaunchConfigurationTabGroup extends
AbstractLaunchConfigurationTabGroup {

public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
	
	ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
			new MOFScript2iTrace_LaunchConfigurationTab(),
			new CommonTab()
	};
	setTabs(tabs);		
}

}
