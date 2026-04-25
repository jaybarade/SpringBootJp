package com.jpcode.productlsit.exception;

import com.jpcode.productlsit.dto.ExceptionResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice //use to exception handle
public class GlobalExceptionHandler {

    @ExceptionHandler(CategoryAlreadyExitException.class)
    public ResponseEntity<ExceptionResponseDTO> handleCategoryAlreadyExistsException(CategoryAlreadyExitException ex){

        ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(
                ex.getMessage(),
                HttpStatus.CONFLICT
        );
        return  ResponseEntity.status(HttpStatus.CONFLICT).body(exceptionResponseDTO);
    }

  @ExceptionHandler(CategoryNotFoundException.class)
    public ResponseEntity<ExceptionResponseDTO> handleCategoryNotFoundException(CategoryNotFoundException ex){
      ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(
              ex.getMessage(),
              HttpStatus.CONFLICT
      );
        return  ResponseEntity.status(HttpStatus.CONFLICT).body(exceptionResponseDTO);
    }

}
