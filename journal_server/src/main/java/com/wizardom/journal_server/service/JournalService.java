package com.wizardom.journal_server.service;

import com.wizardom.journal_server.model.Journal;
import com.wizardom.journal_server.repository.JournalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class JournalService {

    private final JournalRepository journalRepository;

    public Collection<Journal> getByUser(long userId){
        return  journalRepository.getByUser(userId);
    }

    public Collection<Journal> getAll() {
        return journalRepository.getAll();
    }

    public Journal saveJournal(Journal journal) {
        return journalRepository.save(journal);
    }

    public Journal getById(long id) throws Exception {
        return journalRepository
                .getById(id)
                .orElseThrow(() -> new Exception("Not found"));
    }

    public Journal editJournal(long id, Journal journal) throws Exception {
        Optional<Journal> journ = journalRepository.getById(id);
        if (journ.isEmpty()) {
            throw new Exception("Journal not found");
        }
        return journalRepository.save(journal.setId(id));
    }
}
