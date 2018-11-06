package kr.ac.dit.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.dit.domain.StudentVO;
@Repository//이데이터 베이스 입출력코드가 들어잇는곳
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	SqlSession sqlSession;
	public void insertstudentInsert(StudentVO studentVO) throws Exception{
		sqlSession.insert("StudentMapper.insertStudent", studentVO);
		
	}
		  public List<StudentVO> selectStudentList() throws Exception {
			  return sqlSession.selectList("StudentMapper.selectStudentList"); 
			}
	
}
