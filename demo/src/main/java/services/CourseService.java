package services;
import entities.Course;
import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    Course getCourse(int courseId);

    Course addCourse(Course course);

    void updateCourseDetails(Course course, int courseID) throws Exception;

    String deleteCourseDetails(int i);
}
