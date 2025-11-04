package org.example.nfmongodbdevapp.controller;

import org.example.nfmongodbdevapp.model.Student;
import org.example.nfmongodbdevapp.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return  service.getAllStudents();

    }

    @GetMapping("/{id}")
    public Student getStudentByFirstName(@PathVariable String id) {
        return service.getStudentByFirstName(id);
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return  service.addStudent(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable String id, @RequestBody Student student) {
       return  service.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id) {
        service.deleteStudent(id);
    }
}
