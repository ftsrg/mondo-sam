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
		final String benchCase = caseDescriptor.getCaseName();
		final int size = caseDescriptor.getSize();
		final int runIndex = caseDescriptor.getRunIndex();
		return tool + "-" + benchCase + "-" + scenario + "-Size" + size + "-Index" + runIndex;
	}

	public CaseDescriptor getCaseDescriptor() {
		return caseDescriptor;
	}

	public void setCaseDescriptor(CaseDescriptor caseDescriptor) {
		this.caseDescriptor = caseDescriptor;
	}

}
