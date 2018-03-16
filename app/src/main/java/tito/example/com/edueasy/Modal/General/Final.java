package tito.example.com.edueasy.Modal.General;

import android.widget.ImageView;

/**
 * Created by tito on 16/3/18.
 */

public class Final {
    private String coursename;
    private String coursedescription;
    private String courseimage;

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCoursedescription() {
        return coursedescription;
    }

    public void setCoursedescription(String coursedescription) {
        this.coursedescription = coursedescription;
    }

    public String getCourseimage() {
        return courseimage;
    }

    public void setCourseimage(String courseimage) {
        this.courseimage = courseimage;
    }

    public Final(String coursename, String coursedescription, String courseimage) {
        this.coursename = coursename;
        this.coursedescription = coursedescription;
        this.courseimage = courseimage;
    }




    public Final() {
    }
}