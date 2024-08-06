package controller;

import entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import services.CourseService;

import java.util.List;

@RestController
public class MyController {
//Some sort of Run time polimorphism
    @Autowired  //Spring boot will create the object of CourseServiceImplementation class and inject it into the interface reference, this is known as dependency injection
    private CourseService courseService;

    @GetMapping("/")
    String welcome(){
        return "Welcome to Spring Boot Rest API class";
    }
    @GetMapping("/courses")
    List<Course> getCourses() {
        return this.courseService.getCourses();
    }
}
