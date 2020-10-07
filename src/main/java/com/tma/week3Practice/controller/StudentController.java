package com.tma.week3Practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tma.week3Practice.model.Student;
import com.tma.week3Practice.service.IStudentService;

@RestController
public class StudentController {

	@Autowired
	private IStudentService studentService;

	@GetMapping(path = "/students")
	public @ResponseBody Iterable<Student> readStudents() {
		return studentService.readStudents();

	}

	@PostMapping(path = "/students")
	public @ResponseBody String createStudents(@RequestBody Student student) {
		return studentService.createStudents(student);
	}

}
