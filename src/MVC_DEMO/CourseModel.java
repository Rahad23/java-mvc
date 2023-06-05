package MVC_DEMO;

public class CourseModel {
    private String courseName;
    private int courseID;
    private String courseCategory;

    public CourseModel(String c_Name, int c_ID, String c_Category){
        super();
        courseName = c_Name;
        courseID = c_ID;
        courseCategory = c_Category;
    }

    public String getCourseName() {
        return courseName;
    }

    public String setCourseName(String courseName) {
        return courseName;
    }

    public int getCourseID(){
        return courseID;
    }

    public void setCourseID(int cID){
        courseID = cID;
    }

    public String getCourseCategory(){
            return courseCategory;
    }

    public String setCourseCategory(String C_Category){
        return courseCategory = C_Category;
    }

}
