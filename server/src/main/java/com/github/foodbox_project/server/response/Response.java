package com.github.foodbox_project.server.response;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response<T> {

    private ResponseStatus status;
    private T data;
    private ResponseError error;

    public Response(ResponseStatus status) {
        this.status = status;
    }

    public Response(T data) {
        this.status = ResponseStatus.SUCCESS;
        this.data = data;
    }

    public Response(ResponseError error) {
        this.status = ResponseStatus.ERROR;
        this.error = error;
    }

    public enum ResponseStatus {
        SUCCESS("Success"), ERROR("Error");

        private String name;

        ResponseStatus(String name){
            this.name = name;
        }

        @JsonValue
        public String getName() {
            return name;
        }
    }
}
