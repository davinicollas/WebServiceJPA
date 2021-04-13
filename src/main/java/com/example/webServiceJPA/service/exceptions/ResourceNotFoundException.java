package com.example.webServiceJPA.service.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Não encontramos o id: " + id);
	}

}
