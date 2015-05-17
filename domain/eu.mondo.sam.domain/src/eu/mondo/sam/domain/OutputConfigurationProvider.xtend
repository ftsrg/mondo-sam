package eu.mondo.sam.domain

import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import org.eclipse.xtext.generator.IFileSystemAccess
import java.util.Set

class OutputConfigurationProvider implements IOutputConfigurationProvider{
	
	override Set<OutputConfiguration> getOutputConfigurations() {
		val OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT)
    	defaultOutput.setDescription("Output Folder")
	    defaultOutput.setOutputDirectory("./src")
    	defaultOutput.setOverrideExistingResources(true)
    	defaultOutput.setCreateOutputDirectory(true)
    	defaultOutput.setCleanUpDerivedResources(false)
    	defaultOutput.setSetDerivedProperty(true)
    	return newHashSet(defaultOutput)
	}
	
}