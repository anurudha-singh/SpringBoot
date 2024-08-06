package services;
import entities.Course;
import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    Course getCourse(int courseId);
}
