package com.tma.week3Practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.week3Practice.model.Student;
import com.tma.week3Practice.repository.StudentRepository;

@Service
public class StudentService implements IStudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public String check(Student student) {
		String message = "valid";
		if (student.getName().length() > 30) {
			message = "Name was tool long!";
		} else if (student.getAge() < 0 || student.getAge() > 100) {
			message = "Age is not valid";
		} else if (student.getClasses().length() < 1 || student.getClasses().length() > 10) {
			message = "Class's name is not valid";
		}
		return message;
	}

	@Override
	public String createStudents(Student student) {
		String message = this.check(student);
		if (message == "valid") {
			studentRepository.save(student);
		}
		return message;
	}

	@Override
	public Iterable<Student> readStudents() {
		return studentRepository.findAll();
	}
}
