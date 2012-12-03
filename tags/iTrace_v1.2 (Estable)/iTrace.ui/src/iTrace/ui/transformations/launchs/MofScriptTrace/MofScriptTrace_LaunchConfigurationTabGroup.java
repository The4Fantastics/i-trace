package iTrace.ui.transformations.launchs.MofScriptTrace;

import iTrace.ui.transformations.launchs.MofScriptTrace.MofScriptTrace_LaunchConfigurationTab;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class MofScriptTrace_LaunchConfigurationTabGroup extends
AbstractLaunchConfigurationTabGroup {

public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
	
	ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
			new MofScriptTrace_LaunchConfigurationTab(),
			new CommonTab()
	};
	setTabs(tabs);		
}

}
