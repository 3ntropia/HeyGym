package com.heysteve.heygym.heycore.dao;

/**
 * Created by martinh on 26/3/2017.
 */
public interface Dao {
    void save(Object object);
    void update(Object object);
    void delete(Object object);
    Object findById(String id);
}
