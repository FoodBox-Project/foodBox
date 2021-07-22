package com.github.foodbox_project.server.response;

import com.fasterxml.jackson.annotation.JsonValue;

public class ResponseError {

    private ErrorType errorType;
    private Object data;

    public ResponseError(ErrorType errorType) {
        this.errorType = errorType;
    }

    public ResponseError(ErrorType errorType, Object data) {
        this.errorType = errorType;
        this.data = data;
    }

    public ErrorType getErrorType() {
        return errorType;
    }

    public void setErrorType(ErrorType errorType) {
        this.errorType = errorType;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public enum ErrorType {
        ILLEGAL_ARGUMENTS("Illegal Arguments"),
        UNEXPECTED_ERRORS("UnexpectedErrors"),
        FORBIDDEN("Forbidden"),
        ACCESS_DENIED("AccessDenied"),
        FORBIDDEN_DELETE_ENTITY("Forbidden delete entity"),
        ENTITY_NOT_FOUND("Entity not found");

        private String name;

        ErrorType(String name) {
            this.name = name;
        }

        @JsonValue
        public String getName() {
            return name;
        }
    }
}
