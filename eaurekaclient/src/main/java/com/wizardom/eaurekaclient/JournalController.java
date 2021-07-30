package com.wizardom.eaurekaclient;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("journals")
public class JournalController {
    private final RestTemplate restTemplate;

    @GetMapping()
    public Collection<Journal> getJournals() {
        return List.of(restTemplate.getForObject("http://localhost:8081/journals", Journal[].class));
    }

    @GetMapping("{id}")
    public Journal getJournalById(@PathVariable long id) {
        return restTemplate.getForObject("http://localhost:8081/journals/{id}", Journal.class, id);
    }

    @GetMapping("users/{id}")
    public Collection<Journal> getJournalsByUser(@PathVariable("id") long id) {
        return List.of(restTemplate.getForObject("http://localhost:8081/journals/users/{id}", Journal[].class, id));
    }
}
