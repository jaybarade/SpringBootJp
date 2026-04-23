package com.jpcode.productlsit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalTime;

@Data
@AllArgsConstructor
public class ExceptionResponseDTO {

    private String errorMessage;
    private HttpStatus  statuscode;

   // private LocalTime localTime;
}
