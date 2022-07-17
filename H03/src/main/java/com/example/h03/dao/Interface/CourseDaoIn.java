package com.example.h03.dao.Interface;

public interface CourseDaoIn<Course> extends BaseDAO<Course>{
    void deleteByCode(String code);
}
