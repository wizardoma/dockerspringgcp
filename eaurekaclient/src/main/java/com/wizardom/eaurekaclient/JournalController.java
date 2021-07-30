package com.wizardom.eaurekaclient;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping("journals")
public class JournalController {
    private final RestTemplate restTemplate;
    private final JournalClient journalClient;

    @GetMapping()
    public Collection<Journal> getJournals() {
        return journalClient.getJournals().getBody();
    }

    @GetMapping("{id}")
    public Journal getJournalById(@PathVariable long id) {
        return journalClient.getJournalById(id).getBody();
    }

    @GetMapping("users/{id}")
    public Collection<Journal> getJournalsByUser(@PathVariable("id") long id) {
        return journalClient.getJournalsByUser(id).getBody();

    }
}
