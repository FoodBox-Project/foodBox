package com.github.foodbox_project.server.configuration;

import com.github.foodbox_project.server.response.Response;
import com.github.foodbox_project.server.response.ResponseError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends ExceptionHandlerExceptionResolver {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleAllException(Exception e) {
        log.error("", e);
        return new ResponseEntity<>(new Response<>(new ResponseError(ResponseError.ErrorType.UNEXPECTED_ERRORS, e.getMessage())),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

    // todo need to add custom exceptions and their handling
}
