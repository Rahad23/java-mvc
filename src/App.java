import MVC_DEMO.CourseModel;
import MVC_DEMO.Course_contoller;
import MVC_DEMO.Course_view;

public class App {

    public static void main(String[] args) throws Exception {
        CourseModel cModel = retriveDataFromDatabase();
        Course_view cview = new Course_view();
        Course_contoller cController = new Course_contoller(cModel, cview);
        cController.setCourseN_("Java");

        cController.update_view();
    }

    static CourseModel retriveDataFromDatabase() {
        CourseModel courseM = new CourseModel();
        courseM.setCourseName("Python");
        courseM.setCourseCategory("Full stack development");
        courseM.setCourseID(1090);
        return courseM;
    }

}
