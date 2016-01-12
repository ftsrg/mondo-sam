package eu.mondo.sam.core.util;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.commons.io.FileUtils;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.apache.http.entity.ContentType;

import com.google.common.base.Throwables;

public class FileOperations {

	private static final String WEBHDFS_SCHEME = "webhdfs";

	private static URI makeWebHdfsUri(URI destination, String operation) {
		try {
			return new URI("http", "", destination.getHost(), destination.getPort(), "/webhdfs/v1/" + destination.getPath(), "op=" + operation, "");
		} catch (URISyntaxException e) {
			throw Throwables.propagate(e);
		}
	}
	
	private static boolean isHdfs(URI destination) {
		return (destination.getScheme() != null) && destination.getScheme().equals(WEBHDFS_SCHEME);
	}

	public static void copy(File source, URI destination) throws IOException {
		if (isHdfs(destination)) {
			URI endpointUri = makeWebHdfsUri(destination, "CREATE");
			Response response = Request.Put(endpointUri).execute();
			String location = response.returnResponse().getFirstHeader("Location").getValue();
			Request.Put(location).bodyFile(source, ContentType.DEFAULT_BINARY).execute();
		} else {
			FileUtils.copyFile(source, new File(destination.getPath()));
		}
	}

	public static void copy(URI source, File destination) throws IOException {
		if (isHdfs(source)) {
			Request.Get(makeWebHdfsUri(source, "OPEN")).execute().saveContent(destination);
		} else {
			FileUtils.copyFile(new File(source.getPath()), destination);
		}
	}

	public static File loadModel(URI modelUriWithoutExtension, String postfix) throws IOException {
		URI modelUriWithExtension = UriUtils.appendSuffix(modelUriWithoutExtension, postfix);
		File tempFile = File.createTempFile("benchmark", null);
		copy(modelUriWithExtension, tempFile);
		return tempFile;
	}

}
