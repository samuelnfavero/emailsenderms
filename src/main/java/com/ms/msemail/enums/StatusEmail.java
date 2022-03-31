package com.ms.msemail.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor @Getter
public enum StatusEmail {

    SENT("Sent"),
    ERROR("Error");

    private final String status;
}
