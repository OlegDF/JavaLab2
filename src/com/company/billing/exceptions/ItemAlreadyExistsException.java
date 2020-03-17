package com.company.billing.exceptions;

public class ItemAlreadyExistsException extends Exception {

    public ItemAlreadyExistsException() {
        super("Tried to add item that's already present in the catalogue.");
    }

    public ItemAlreadyExistsException(String item) {
        super("Tried to add item that's already present in the catalogue. Item's name: " + item);
    }

}
