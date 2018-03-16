package tito.example.com.edueasy.Modal;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class TeaserVideo{

	@SerializedName("youtube_url")
	private String youtubeUrl;

	public void setYoutubeUrl(String youtubeUrl){
		this.youtubeUrl = youtubeUrl;
	}

	public String getYoutubeUrl(){
		return youtubeUrl;
	}

	@Override
 	public String toString(){
		return 
			"TeaserVideo{" + 
			"youtube_url = '" + youtubeUrl + '\'' + 
			"}";
		}
}