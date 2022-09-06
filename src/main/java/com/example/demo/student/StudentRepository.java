package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository

public interface StudentRepository
        extends JpaRepository<Student,Long> {
    // select * from student where email = ?
//    @Query("select s From Student s WHERE s.email =?1")
    Optional<Student> findStudentByEmail(String email);
}
