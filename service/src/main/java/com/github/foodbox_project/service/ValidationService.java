package com.github.foodbox_project.service;

import com.github.foodbox_project.api.service.IValidationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ValidationService implements IValidationService {

    @Override
    public void validatePagination(int start, int limit) {
        if (start < 0 || limit < 1) {
            log.warn("Illegal Arguments: page number {}, page size {}", start, limit);
            throw new IllegalArgumentException("Illegal pagination arguments");
        }
    }
}
