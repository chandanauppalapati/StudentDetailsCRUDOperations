package com.chandcodes.StudentDetailsCRUD.repository;

import com.chandcodes.StudentDetailsCRUD.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
