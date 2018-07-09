package com.neuedu.service.student;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.neuedu.dao.StudentDao;
import com.neuedu.pojo.Student;

@Service
public class StudentServiceImpl implements IstudentService{
	@Resource
	private StudentDao dao;

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return dao.getStudents();
	}
}
