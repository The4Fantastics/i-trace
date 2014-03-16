package iTrace.ui.transformations.launchs.MOFScript2iTrace;

import iTrace.ui.transformations.launchs.MOFScript2iTrace.MOFScript2iTrace_LaunchConfigurationTab;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class MOFScript2iTrace_LaunchConfigurationTabGroup extends
AbstractLaunchConfigurationTabGroup {

public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
	
	ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
			new MOFScript2iTrace_LaunchConfigurationTab(),
			new CommonTab()
	};
	setTabs(tabs);		
}

}
