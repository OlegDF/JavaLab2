package com.company.billing.exceptions;

public class NegativeQuantityException extends Exception {

    public NegativeQuantityException() {
        super("The warehouse somehow contains less than zero items of one type.");
    }

}
