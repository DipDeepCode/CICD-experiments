package ru.ddc.exp_01.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {

    /**
     * Response code.
     */
    private int code;

    /**
     * Response message.
     */
    private String message;
}
