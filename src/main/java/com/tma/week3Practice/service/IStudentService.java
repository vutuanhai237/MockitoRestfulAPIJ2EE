package com.tma.week3Practice.service;

import com.tma.week3Practice.model.Student;

public interface IStudentService {
	public String createStudents(Student student);

	public Iterable<Student> readStudents();

	public String check(Student student);
}
