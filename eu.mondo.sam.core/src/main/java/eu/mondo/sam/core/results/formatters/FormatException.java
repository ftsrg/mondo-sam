package eu.mondo.sam.core.results.formatters;

public class FormatException extends Exception {

	private static final long serialVersionUID = 7837894786863576342L;

	public FormatException() {
		super();
	}

	public FormatException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FormatException(String message, Throwable cause) {
		super(message, cause);
	}

	public FormatException(String message) {
		super(message);
	}

	public FormatException(Throwable cause) {
		super(cause);
	}

}
