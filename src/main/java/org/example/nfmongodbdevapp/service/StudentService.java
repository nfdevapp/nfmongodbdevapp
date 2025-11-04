package org.example.nfmongodbdevapp.service;

import org.example.nfmongodbdevapp.model.entity.Student;
import org.example.nfmongodbdevapp.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<Student> getAllStudents() {
        return  studentRepo.findAll();

    }

    public Student getStudentByFirstName(String id) {
        return studentRepo.findById(id).orElse(null);
    }

//    public Student addStudent(StudentDTO student) {
//        Student newStudent = Student.builder().
//                id(id)
//        return  studentRepo.save(student);
//    }

    public Student updateStudent(String id, Student student) {
        Student oldData = studentRepo.findById(id).orElse(null);
        if (oldData != null) {
            studentRepo.save(
                    oldData.
                            withAge(student.age()).
                            withFirstName(student.firstName()).
                            withLastName(student.lastName()));
        }
        return  student;
    }

    public void deleteStudent(String id) {
        studentRepo.deleteById(id);
    }
}
