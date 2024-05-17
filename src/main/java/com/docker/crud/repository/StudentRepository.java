package com.docker.crud.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.docker.crud.model.Student;

public interface StudentRepository extends JpaRepository<Student, BigInteger>{
	
//	@Query(value ="delete from student where studentid = :studentId",nativeQuery = true)
//	int deleteStudentId(@Param("studentId") BigInteger studentId);
	
}
