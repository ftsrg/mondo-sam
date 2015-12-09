package eu.mondo.sam.core.publishers;

import eu.mondo.sam.core.results.CaseDescriptor;

public class DefaultFilenameFactory implements FilenameFactory {

	protected CaseDescriptor caseDescriptor;

	public DefaultFilenameFactory(final CaseDescriptor caseDescriptor) {
		this.caseDescriptor = caseDescriptor;
	}

	@Override
	public String getFilename() {
		final String tool = caseDescriptor.getTool();
		final String scenario = caseDescriptor.getScenario();
		final String case_ = caseDescriptor.getCase();
		final String artifact = caseDescriptor.getArtifact();
		final int run = caseDescriptor.getRun();
		return tool + "-" + case_ + "-" + scenario + "-Size" + artifact + "-Index" + run;
	}

	public CaseDescriptor getCaseDescriptor() {
		return caseDescriptor;
	}

	public void setCaseDescriptor(final CaseDescriptor caseDescriptor) {
		this.caseDescriptor = caseDescriptor;
	}

}
