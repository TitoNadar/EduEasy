package tito.example.com.edueasy.Modal.udacity;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class TracksItem{

	@SerializedName("courses")
	private List<String> courses;

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private String description;

	public void setCourses(List<String> courses){
		this.courses = courses;
	}

	public List<String> getCourses(){
		return courses;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

//	@Override
// 	public String toString(){
//		return
//			"TracksItem{" +
//			"courses = '" + courses + '\'' +
//			",name = '" + name + '\'' +
//			",description = '" + description + '\'' +
//			"}";
//		}
}