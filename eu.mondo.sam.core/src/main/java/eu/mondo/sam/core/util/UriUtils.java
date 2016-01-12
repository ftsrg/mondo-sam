package eu.mondo.sam.core.util;

import java.net.URI;

import org.apache.commons.io.FilenameUtils;

public class UriUtils {

	public static URI appendSuffix(URI resultFilePathWithoutExtension, String suffix) {
		String fileNameWithExtension = FilenameUtils.getName(resultFilePathWithoutExtension.toString()) + suffix;
		URI resultFilePath = resultFilePathWithoutExtension.resolve(fileNameWithExtension);
		return resultFilePath;
	}

	public static URI appendSegment(URI base, String segment) {
		String name = FilenameUtils.getName(base.getPath());
		return base.resolve(name + "/" + segment);
	}

}
