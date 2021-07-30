package com.wizardom.journal_server.repository;

import com.wizardom.journal_server.model.Journal;

import java.util.Collection;
import java.util.Optional;

public interface IRepository<T, I> {

    Optional<T> getById(I id);
    void delete(I id);
    T save(T t);
    T edit(T t);
    Collection<T> getAll();

    Collection<Journal> getByUser(long userId);
}
