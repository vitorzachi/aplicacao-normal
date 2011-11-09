package br.edu.unoesc.petshop.exception;

public class ServiceException extends RuntimeException {

	private static final long serialVersionUID = -3827850811398314730L;

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Throwable ex) {
		super(ex);
	}

}
