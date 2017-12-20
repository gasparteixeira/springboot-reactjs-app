package br.com.getnet.retaguarda.v1.exception;

public class BookNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1664686769432739865L;

	public BookNotFoundException() {
		super();
	}

	public BookNotFoundException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public BookNotFoundException(final String message) {
		super(message);
	}

	public BookNotFoundException(final Throwable cause) {
		super(cause);
	}

}
