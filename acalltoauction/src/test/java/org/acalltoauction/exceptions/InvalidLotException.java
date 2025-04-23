package org.acalltoauction.exceptions;

public class InvalidLotException extends RuntimeException {
    public InvalidLotException(String message) {
        super(message);
    }
}

