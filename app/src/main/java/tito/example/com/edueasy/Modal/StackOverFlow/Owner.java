package tito.example.com.edueasy.Modal.StackOverFlow;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Owner{

	@SerializedName("profile_image")
	private String profileImage;

	@SerializedName("user_type")
	private String userType;

	@SerializedName("user_id")
	private int userId;

	@SerializedName("link")
	private String link;

	@SerializedName("reputation")
	private int reputation;

	@SerializedName("display_name")
	private String displayName;

	public void setProfileImage(String profileImage){
		this.profileImage = profileImage;
	}

	public String getProfileImage(){
		return profileImage;
	}

	public void setUserType(String userType){
		this.userType = userType;
	}

	public String getUserType(){
		return userType;
	}

	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return userId;
	}

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setReputation(int reputation){
		this.reputation = reputation;
	}

	public int getReputation(){
		return reputation;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}

	@Override
 	public String toString(){
		return 
			"Owner{" + 
			"profile_image = '" + profileImage + '\'' + 
			",user_type = '" + userType + '\'' + 
			",user_id = '" + userId + '\'' + 
			",link = '" + link + '\'' + 
			",reputation = '" + reputation + '\'' + 
			",display_name = '" + displayName + '\'' + 
			"}";
		}
}