package com.wizardom.journal_server.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.Instant;

@Accessors(chain = true)
@Data
public class Journal {
    private String body;
    private String userId;
    private Instant date;
    private long id;

}
