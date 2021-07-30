package com.wizardom.journal_server.repository;

import com.wizardom.journal_server.model.Journal;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.wizardom.journal_server.config.JournalConfig.journals;

@Repository
public class JournalRepository implements IRepository<Journal, Long> {

    @Override
    public Optional<Journal> getById(Long id) {
        return Optional.ofNullable(journals.get(Integer.parseInt(id + "")));
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Journal save(Journal journal) {
        journals.add(journal);
        return journal;
    }

    @Override
    public Journal edit(Journal journal) {
        return null;
    }

    @Override
    public Collection<Journal> getAll() {
        return journals;
    }

    @Override
    public Collection<Journal> getByUser(long userId) {
        return journals.stream().filter(journal -> journal.getUserId().equals(String.valueOf(userId))).collect(Collectors.toList());
    }
}
