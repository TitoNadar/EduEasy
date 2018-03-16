package tito.example.com.edueasy.Modal.Books;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class BooksItem{

	@SerializedName("Description")
	private String description;

	@SerializedName("isbn")
	private String isbn;

	@SerializedName("Title")
	private String title;

	@SerializedName("ID")
	private long iD;

	@SerializedName("Image")
	private String image;

	@SerializedName("SubTitle")
	private String subTitle;

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setIsbn(String isbn){
		this.isbn = isbn;
	}

	public String getIsbn(){
		return isbn;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setID(long iD){
		this.iD = iD;
	}

	public long getID(){
		return iD;
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setSubTitle(String subTitle){
		this.subTitle = subTitle;
	}

	public String getSubTitle(){
		return subTitle;
	}

	@Override
 	public String toString(){
		return 
			"BooksItem{" + 
			"description = '" + description + '\'' + 
			",isbn = '" + isbn + '\'' + 
			",title = '" + title + '\'' + 
			",iD = '" + iD + '\'' + 
			",image = '" + image + '\'' + 
			",subTitle = '" + subTitle + '\'' + 
			"}";
		}
}