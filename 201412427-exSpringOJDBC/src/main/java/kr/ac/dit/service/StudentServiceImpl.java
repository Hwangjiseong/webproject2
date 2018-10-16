package kr.ac.dit.service;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.dit.domain.StudentVO;
import kr.ac.dit.persistence.StudentDAO;
@Service//이클래스는 비지니스 로직이 들어간 클래스다
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO studentDAO;
	public void createStudent(StudentVO studentVO) throws Exception {
		studentDAO.insertstudentInsert (studentVO);
	}
	public List<StudentVO> readStudentList() throws Exception {
		return studentDAO.selectStudentList();
	}
}
