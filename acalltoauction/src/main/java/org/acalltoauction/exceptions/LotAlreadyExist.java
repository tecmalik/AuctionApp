package org.acalltoauction.exceptions;

public class LotAlreadyExist extends RuntimeException {
    public LotAlreadyExist(String message) {
        super(message);
    }
}
