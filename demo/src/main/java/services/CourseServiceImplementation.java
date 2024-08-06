package services;

import entities.Course;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImplementation implements CourseService{

    List<Course> list;

    public CourseServiceImplementation() {
        list=new ArrayList<>();
        list.add(new Course(1,"Java Course","Basics of Java"));
        list.add(new Course(2,"Spirng boot","Basics of Rest APIs"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(int courseId) {
        Course requestedCourse = null;
        for (Course course : list) {
            if (course.getID() == courseId) {
                requestedCourse = course;
                break;
            }

        }
        return requestedCourse;
    }

    @Override
    public String addCourse(Course course){
        list.add(course);
        return "Course was added successfully";
    }
}
