package tito.example.com.edueasy.Modal.udacity_Modal;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class InstructorsItem{

	@SerializedName("image")
	private String image;

	@SerializedName("name")
	private String name;

	@SerializedName("bio")
	private String bio;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setBio(String bio){
		this.bio = bio;
	}

	public String getBio(){
		return bio;
	}

	@Override
 	public String toString(){
		return 
			"InstructorsItem{" + 
			"image = '" + image + '\'' + 
			",name = '" + name + '\'' + 
			",bio = '" + bio + '\'' + 
			"}";
		}
}