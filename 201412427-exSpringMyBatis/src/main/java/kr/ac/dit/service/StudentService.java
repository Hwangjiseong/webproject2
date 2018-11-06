package kr.ac.dit.service;

import java.util.*;

import kr.ac.dit.domain.StudentVO;

public interface StudentService {
	public void createStudent(StudentVO studentVO) throws Exception ;//인서트 관련
	
	public List<StudentVO> readStudentList() throws Exception;
}
