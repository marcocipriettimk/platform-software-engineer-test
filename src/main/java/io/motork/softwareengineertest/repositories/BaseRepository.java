package io.motork.softwareengineertest.repositories;

import java.util.List;

public abstract class BaseRepository<T extends Object> {
    abstract void save(T object);
    abstract T findById(String id);
    abstract void update(T object);
    abstract void delete(T object);
    abstract List<T> findAll();
}
