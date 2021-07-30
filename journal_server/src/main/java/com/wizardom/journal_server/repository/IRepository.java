package com.wizardom.journal_server.repository;

import java.util.Collection;
import java.util.Optional;

public interface IRepository<T, I> {

    Optional<T> getById(I id);
    void delete(I id);
    T save(T t);
    T edit(T t);
    Collection<T> getAll();

}
