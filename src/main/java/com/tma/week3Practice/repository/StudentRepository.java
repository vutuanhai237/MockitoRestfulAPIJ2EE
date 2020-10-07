package com.tma.week3Practice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tma.week3Practice.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
	Student findByName(String name);

}
