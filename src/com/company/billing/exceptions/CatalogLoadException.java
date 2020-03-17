package com.company.billing.exceptions;

public class CatalogLoadException extends Exception {

    public CatalogLoadException() {
        super("Failure when loading the default catalog.");
    }

    public CatalogLoadException(Exception e) {
        super("Failure when loading the default catalog. Exception text: " + e.getMessage());
    }

}
