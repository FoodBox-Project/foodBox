package com.github.foodbox_project.exceptions;

public class ServiceException extends RuntimeException {

    public ServiceException() {
        super();
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String massage, Throwable cause) {
        super(massage, cause);
    }
}
