package com.littlesekii.generics.data_sctructures.domain.exception;

public class InvalidDataStructureAccessException extends RuntimeException {
    
    public InvalidDataStructureAccessException() {
        super();
    }

    public InvalidDataStructureAccessException(String msg) {
        super(msg);
    }
}
