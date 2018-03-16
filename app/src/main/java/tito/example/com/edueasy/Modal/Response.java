package tito.example.com.edueasy.Modal;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Response{

	@SerializedName("courses")
	private List<CoursesItem> courses;

	@SerializedName("tracks")
	private List<TracksItem> tracks;

	@SerializedName("degrees")
	private List<DegreesItem> degrees;

	public void setCourses(List<CoursesItem> courses){
		this.courses = courses;
	}

	public List<CoursesItem> getCourses(){
		return courses;
	}

	public void setTracks(List<TracksItem> tracks){
		this.tracks = tracks;
	}

	public List<TracksItem> getTracks(){
		return tracks;
	}

	public void setDegrees(List<DegreesItem> degrees){
		this.degrees = degrees;
	}

	public List<DegreesItem> getDegrees(){
		return degrees;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"courses = '" + courses + '\'' + 
			",tracks = '" + tracks + '\'' + 
			",degrees = '" + degrees + '\'' + 
			"}";
		}
}