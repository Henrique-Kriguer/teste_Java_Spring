package com.HenriqueKriguer.backEndTest.entities.enums;

public enum EnderecoStatus {
	
	PRINCIPAL(0),
	RESIDENCIA(1),
	TRABALHO(2),
	OUTRO(3);

	private int code;
	
	private EnderecoStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static EnderecoStatus valueOf(int code) {
		for (EnderecoStatus value : EnderecoStatus.values() ) {
			if (value.getCode()== code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid EnderecoStatus code");
	}
}
