package tito.example.com.edueasy.Modal.Iversity;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class InstructorsItem{

	@SerializedName("image")
	private String image;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("biography")
	private String biography;

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

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setBiography(String biography){
		this.biography = biography;
	}

	public String getBiography(){
		return biography;
	}

//	@Override
// 	public String toString(){
//		return
//			"InstructorsItem{" +
//			"image = '" + image + '\'' +
//			",name = '" + name + '\'' +
//			",id = '" + id + '\'' +
//			",biography = '" + biography + '\'' +
//			"}";
//		}
}