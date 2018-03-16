package tito.example.com.edueasy.Modal.Iversity;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class OrganisationsItem{

	@SerializedName("image")
	private String image;

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private Object description;

	@SerializedName("id")
	private int id;

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

	public void setDescription(Object description){
		this.description = description;
	}

	public Object getDescription(){
		return description;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}
//
//	@Override
// 	public String toString(){
//		return
//			"OrganisationsItem{" +
//			"image = '" + image + '\'' +
//			",name = '" + name + '\'' +
//			",description = '" + description + '\'' +
//			",id = '" + id + '\'' +
//			"}";
//		}
}