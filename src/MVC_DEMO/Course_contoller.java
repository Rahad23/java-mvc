package MVC_DEMO;

public class Course_contoller {
    private CourseModel cModel;
    private Course_view cView;

    public Course_contoller(CourseModel cModel, Course_view cView) {
        this.cModel = cModel;
        this.cView = cView;
    }

    public void setCourseN_(String setName) {
        cModel.setCourseName(setName);
    }

    public void setCourseID(int _id) {
        cModel.setCourseID(_id);
    }

    public void setCourseCategory(String c_name) {
        cModel.setCourseCategory(c_name);
    }

    public String getCourseName() {
        return cModel.getCourseName();
    }

    public int getCourseID() {
        return cModel.getCourseID();
    }

    public String getCourseCategory() {
        return cModel.getCourseCategory();
    }

    public void update_view() {
        cView.courseDetail(getCourseID(), getCourseCategory(), getCourseName());
    }
}
