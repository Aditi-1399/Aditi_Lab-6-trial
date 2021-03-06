package com.greatlearning.service;

import java.util.List;
import java.util.Optional;

import com.greatlearning.entity.Student;

public interface StudentService {

	List<Student> findAll();

	Student findById(int id);

	void save(Student theStudent);

	void DeleteById(int id);

}
