package org.example.nfmongodbdevapp.repository;

import org.example.nfmongodbdevapp.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student, String> {

    Student getStudentByFirstName(String name);
}
