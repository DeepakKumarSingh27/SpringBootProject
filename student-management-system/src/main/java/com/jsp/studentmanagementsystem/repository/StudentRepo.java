package com.jsp.studentmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

import com.jsp.studentmanagementsystem.dto.StudentRequest;
import com.jsp.studentmanagementsystem.entity.Student;
import com.jsp.studentmanagementsystem.util.ResponseStructure;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	public Student findByStudentEmail(String email);
	
	public Student findByStudentPhNo(long phno);
	
	@Query("select s.studentEmail from Student s where s.studentGrade=?1")
	public List<String> getAllEmailsByGrade(String grade);
	
	
	
	
	//List< String> getAllEmailsByGrade(String grade);
	
//	public ResponseEntity<ResponseStructure<StudentRequest>> saveStudent(StudentRequest studentRequest){
//		
//	}
}
