package controller;

import entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.CourseService;

import java.util.List;

@RestController
public class MyController {
//Some sort of Run time polymorphism
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
    @GetMapping("/course/{courseID}")
    public Course getCourse(@PathVariable String courseID ){
        return this.courseService.getCourse(Integer.parseInt(courseID));
    }
    @PostMapping("/addCourse")
    public String addCourse(@RequestBody Course course){
//        System.out.println("Course added!");
       return courseService.addCourse(course);

    }
    @PutMapping("/update/course/{courseID}")
    public String updateCourseDetails(@RequestBody Course courseDetails,@PathVariable String courseID){
        return courseService.updateCourseDetails(courseDetails,Integer.parseInt(courseID));
    }
}
