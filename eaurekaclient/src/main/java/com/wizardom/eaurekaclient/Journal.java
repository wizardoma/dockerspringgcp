package com.wizardom.eaurekaclient;

import lombok.Data;

import java.time.Instant;

@Data
public class Journal {
    private long id;
    private String body;
    private String user;
    private Instant date;
}
