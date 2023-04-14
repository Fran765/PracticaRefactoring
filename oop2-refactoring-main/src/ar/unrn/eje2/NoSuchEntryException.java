package ar.unrn.eje2;

public class NoSuchEntryException extends Exception{

	private static final long serialVersionUID = 1L;

	public NoSuchEntryException(String message) {
		super(message);
	}
}
