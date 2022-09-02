package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Jack = new Student(
                    "Jack",
                    "apuaimanlian@gmail.com",
                    LocalDate.of(1999, Month.MARCH,5),
                    23
            );

            Student Alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2000, Month.MARCH,7),
                    22
            );

            repository.saveAll(
                    List.of(Jack,Alex)
            );
        };
    }
}
