package com.wizardom.eaurekaclient;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class JournalList {
    private List<Journal> journalList;

    JournalList(){
        journalList = new ArrayList<>();
    }
}
