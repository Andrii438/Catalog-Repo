package com.polarbookshop.catalogservice.domain;

public class BookAlreadyExistsException extends Throwable {
    public BookAlreadyExistsException(String isbn) {
        super("A book with ISBN " + isbn + " already exists.");
    }
}
