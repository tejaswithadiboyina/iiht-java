package com.cms.coursemanagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.cms.coursemanagement.models.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
