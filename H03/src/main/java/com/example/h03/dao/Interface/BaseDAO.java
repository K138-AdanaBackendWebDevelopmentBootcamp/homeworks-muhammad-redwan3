package com.example.h03.dao.Interface;

import java.util.List;

public interface BaseDAO<T> {
    List<T> findAll();
    T findById(int id);
    T save(T object);
    void deleteById(int id);
    T update(T object);
}
