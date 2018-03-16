package tito.example.com.edueasy.Modal;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class AffiliatesItem{

	@SerializedName("image")
	private String image;

	@SerializedName("name")
	private String name;

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

	@Override
 	public String toString(){
		return 
			"AffiliatesItem{" + 
			"image = '" + image + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}