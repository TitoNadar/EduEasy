package tito.example.com.edueasy.Modal.StackOverFlow;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ItemsItem{

	@SerializedName("owner")
	private Owner owner;

	@SerializedName("score")
	private int score;

	@SerializedName("link")
	private String link;

	@SerializedName("last_activity_date")
	private int lastActivityDate;

	@SerializedName("is_answered")
	private boolean isAnswered;

	@SerializedName("creation_date")
	private int creationDate;

	@SerializedName("answer_count")
	private int answerCount;

	@SerializedName("title")
	private String title;

	@SerializedName("question_id")
	private int questionId;

	@SerializedName("view_count")
	private int viewCount;

	@SerializedName("tags")
	private List<String> tags;

	public void setOwner(Owner owner){
		this.owner = owner;
	}

	public Owner getOwner(){
		return owner;
	}

	public void setScore(int score){
		this.score = score;
	}

	public int getScore(){
		return score;
	}

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setLastActivityDate(int lastActivityDate){
		this.lastActivityDate = lastActivityDate;
	}

	public int getLastActivityDate(){
		return lastActivityDate;
	}

	public void setIsAnswered(boolean isAnswered){
		this.isAnswered = isAnswered;
	}

	public boolean isIsAnswered(){
		return isAnswered;
	}

	public void setCreationDate(int creationDate){
		this.creationDate = creationDate;
	}

	public int getCreationDate(){
		return creationDate;
	}

	public void setAnswerCount(int answerCount){
		this.answerCount = answerCount;
	}

	public int getAnswerCount(){
		return answerCount;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setQuestionId(int questionId){
		this.questionId = questionId;
	}

	public int getQuestionId(){
		return questionId;
	}

	public void setViewCount(int viewCount){
		this.viewCount = viewCount;
	}

	public int getViewCount(){
		return viewCount;
	}

	public void setTags(List<String> tags){
		this.tags = tags;
	}

	public List<String> getTags(){
		return tags;
	}

	@Override
 	public String toString(){
		return 
			"ItemsItem{" + 
			"owner = '" + owner + '\'' + 
			",score = '" + score + '\'' + 
			",link = '" + link + '\'' + 
			",last_activity_date = '" + lastActivityDate + '\'' + 
			",is_answered = '" + isAnswered + '\'' + 
			",creation_date = '" + creationDate + '\'' + 
			",answer_count = '" + answerCount + '\'' + 
			",title = '" + title + '\'' + 
			",question_id = '" + questionId + '\'' + 
			",view_count = '" + viewCount + '\'' + 
			",tags = '" + tags + '\'' + 
			"}";
		}
}