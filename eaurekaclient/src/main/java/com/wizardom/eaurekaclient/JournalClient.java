package com.wizardom.eaurekaclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("journalserver")
interface JournalClient {
    @GetMapping()
    ResponseEntity<List<Journal>> getJournals();

    @GetMapping("journals/{id}")
    ResponseEntity<Journal> getJournalById(@PathVariable("id") long id);

    @PostMapping("journals")
    ResponseEntity<Journal> saveJournal(@ModelAttribute Journal journal);

    @PatchMapping("journals/{id}")
    ResponseEntity<Journal> editJournal(@PathVariable("id") long id, @ModelAttribute Journal journal);

    @GetMapping("journals/users/{id}")
    ResponseEntity<List<Journal>> getJournalsByUser(@PathVariable("id") long id);

}
