package tito.example.com.edueasy.Modal.StackOverFlow;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Response{

	@SerializedName("quota_max")
	private int quotaMax;

	@SerializedName("quota_remaining")
	private int quotaRemaining;

	@SerializedName("has_more")
	private boolean hasMore;

	@SerializedName("items")
	private List<ItemsItem> items;

	public void setQuotaMax(int quotaMax){
		this.quotaMax = quotaMax;
	}

	public int getQuotaMax(){
		return quotaMax;
	}

	public void setQuotaRemaining(int quotaRemaining){
		this.quotaRemaining = quotaRemaining;
	}

	public int getQuotaRemaining(){
		return quotaRemaining;
	}

	public void setHasMore(boolean hasMore){
		this.hasMore = hasMore;
	}

	public boolean isHasMore(){
		return hasMore;
	}

	public void setItems(List<ItemsItem> items){
		this.items = items;
	}

	public List<ItemsItem> getItems(){
		return items;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"quota_max = '" + quotaMax + '\'' + 
			",quota_remaining = '" + quotaRemaining + '\'' + 
			",has_more = '" + hasMore + '\'' + 
			",items = '" + items + '\'' + 
			"}";
		}
}