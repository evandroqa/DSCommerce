package com.devsuperior.dscommerce.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationErrorDTO extends CustomErrorDTO{

	private List<FieldValidMsgDTO> errors = new ArrayList<>();
	
	public ValidationErrorDTO(Instant timestamp, Integer status, String error, String path) {
		super(timestamp, status, error, path);
	}

	public List<FieldValidMsgDTO> getErrorsField() {
		return errors;
	}

	public void addError(String fieldName, String message) {
		errors.add(new FieldValidMsgDTO(fieldName, message));
	}
}
