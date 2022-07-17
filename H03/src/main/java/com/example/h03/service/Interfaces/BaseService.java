package com.example.h03.service.Interfaces;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BaseService<T> {
    List<T> findAll();
    T findById(int id);
    T save(T object);
    void deleteById(int id);
    T update(T object);
}
