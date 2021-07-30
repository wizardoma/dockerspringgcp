package com.wizardom.journal_server.controller;

import com.wizardom.journal_server.model.Journal;
import com.wizardom.journal_server.service.JournalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("journals")
public class JournalController {
    private final JournalService service;

    @GetMapping()
    public ResponseEntity<?> getJournals() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getJournalById(@PathVariable("id") long id) throws Exception {
        return ResponseEntity.ok(service.getById(id));
    }

    @PostMapping("")
    public ResponseEntity<?> saveJournal(@ModelAttribute Journal journal) {
        return new ResponseEntity<>(service.saveJournal(journal), HttpStatus.CREATED);
    }

    @PatchMapping("{id}")
    public ResponseEntity<?> editJournal(@PathVariable("id") long id, @ModelAttribute Journal journal) throws Exception {
        return ResponseEntity.ok(service.editJournal(id, journal));
    }

    @GetMapping("users/{id}")
    public ResponseEntity<?> getJournalsByUser(@PathVariable("id") long id) {
        return ResponseEntity.ok(service.getByUser(id));
    }
}
