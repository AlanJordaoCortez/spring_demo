package com.example.demo.student;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/get/all")
	public Iterable<Student> getStudents() {
		return studentService.getStudents();
	}

    @GetMapping("/get")
	public Iterable<Student> getStudentsByName(@RequestParam String name) {
		return studentService.getStudentsByName(name);
	}

    @PostMapping("/add")
    public String addStudent(@RequestParam String name, @RequestParam String email, @RequestParam Integer age) {
        // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request
        return studentService.addStudent(name, email, age);
    }

    @PutMapping("/update/{id}")
	public Student updateStudentEmail(@PathVariable Long id, @RequestParam String email) {
		return studentService.updateStudentEmail(id, email);
	}

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }
    
}
