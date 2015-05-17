package eu.mondo.sam.domain;

import java.util.Set;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class OutputConfigurationProvider implements IOutputConfigurationProvider {
  public Set<OutputConfiguration> getOutputConfigurations() {
    final OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
    defaultOutput.setDescription("Output Folder");
    defaultOutput.setOutputDirectory("./src");
    defaultOutput.setOverrideExistingResources(true);
    defaultOutput.setCreateOutputDirectory(true);
    defaultOutput.setCleanUpDerivedResources(false);
    defaultOutput.setSetDerivedProperty(true);
    return CollectionLiterals.<OutputConfiguration>newHashSet(defaultOutput);
  }
}
