package tito.example.com.edueasy.Modal.Iversity;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Response{

	@SerializedName("courses")
	private List<CoursesItem> courses;

	public void setCourses(List<CoursesItem> courses){
		this.courses = courses;
	}

	public List<CoursesItem> getCourses(){
		return courses;
	}

//	@Override
// 	public String toString(){
//		return
//			"Response{" +
//			"courses = '" + courses + '\'' +
//			"}";
//		}
}