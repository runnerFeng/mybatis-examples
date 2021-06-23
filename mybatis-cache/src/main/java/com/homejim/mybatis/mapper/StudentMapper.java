package com.homejim.mybatis.mapper;

import com.homejim.mybatis.entity.Student;

import java.util.List;

public interface StudentMapper {

    /**
     *
     * @return
     */
    List<Student> selectAll();

    Student selectByPrimaryKey(int id);

    int updateByPrimaryKey(Student student);

    void insert(Student student);
}