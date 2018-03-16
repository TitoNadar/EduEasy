package tito.example.com.edueasy.Modal.Iversity;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class VerificationsItem{

	@SerializedName("credits")
	private Object credits;

	@SerializedName("price")
	private String price;

	@SerializedName("description")
	private String description;

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	public void setCredits(Object credits){
		this.credits = credits;
	}

	public Object getCredits(){
		return credits;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public String getPrice(){
		return price;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

//	@Override
// 	public String toString(){
//		return
//			"VerificationsItem{" +
//			"credits = '" + credits + '\'' +
//			",price = '" + price + '\'' +
//			",description = '" + description + '\'' +
//			",id = '" + id + '\'' +
//			",title = '" + title + '\'' +
//			"}";
//		}
}