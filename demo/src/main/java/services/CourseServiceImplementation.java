package services;
import dao.CourseDao;
import entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImplementation implements CourseService{

   @Autowired
    private CourseDao courseDao;
//    List<Course> list;

    public CourseServiceImplementation() {
//        list=new ArrayList<>();
//        list.add(new Course(1,"Java Course","Basics of Java"));
//        list.add(new Course(2,"Spirng boot","Basics of Rest APIs"));
    }

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(int courseId) {
        return courseDao.getReferenceById((long) courseId);
//        Course requestedCourse = null;
//        for (Course course : list) {
//            if (course.getID() == courseId) {
//                requestedCourse = course;
//                break;
//            }
//
//        }
//        return requestedCourse;
    }

    @Override
    public Course addCourse(Course course){
        return courseDao.save(course);
//        list.add(course);
//        return "Course was added successfully";
    }

    @Override
    public void updateCourseDetails(Course course, int courseID) {
        courseDao.save(course);
        //        for(Course currentCourse : list){
//            if(currentCourse.getID()==courseID){
//                currentCourse.setTitle(course.getTitle());
//                currentCourse.setDescription(course.getDescription());
//                break;
//            }
//            return "Course details were updated successfully!";
//        }
//        return  new Exception().toString();

    }

    @Override
    public String deleteCourseDetails(int courseID) {
//        for(Course currentCourse : list){
//            if(currentCourse.getID()==courseID){
//                list.remove(currentCourse);
//                break;
//            }
//        }
//        return "Course was deleted successfully!";
        Course entity=courseDao.getOne((long) courseID);
        courseDao.delete(entity);
        return "Course was deleted successfully!";
    }
}
