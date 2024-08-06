package services;
import entities.Course;
import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    Course getCourse(int courseId);

    String addCourse(Course course);

    String updateCourseDetails(Course course, int courseID);
}
