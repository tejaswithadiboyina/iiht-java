package com.cms.coursemanagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.cms.coursemanagement.models.Student;

public interface CourseRepository extends CrudRepository<Student, Integer> {

}
