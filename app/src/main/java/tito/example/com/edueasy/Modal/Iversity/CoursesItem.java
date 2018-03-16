package tito.example.com.edueasy.Modal.Iversity;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class CoursesItem {

	@SerializedName("end_date")
	private String endDate;

	@SerializedName("image")
	private String image;

	@SerializedName("knowledge_level")
	private String knowledgeLevel;

	@SerializedName("trailer_video")
	private String trailerVideo;

	@SerializedName("description")
	private String description;

	@SerializedName("language")
	private String language;

	@SerializedName("discipline")
	private String discipline;

	@SerializedName("title")
	private String title;

	@SerializedName("verifications")
	private List<VerificationsItem> verifications;

	@SerializedName("url")
	private String url;

	@SerializedName("ects_available")
	private String ectsAvailable;

	@SerializedName("instructors")
	private List<InstructorsItem> instructors;

	@SerializedName("cover")
	private String cover;

	@SerializedName("duration")
	private String duration;

	@SerializedName("organisations")
	private List<OrganisationsItem> organisations;

	@SerializedName("subtitle")
	private String subtitle;

	@SerializedName("id")
	private int id;

	@SerializedName("state")
	private String state;

	@SerializedName("start_date")
	private String startDate;

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImage() {
		return image;
	}

	public void setKnowledgeLevel(String knowledgeLevel) {
		this.knowledgeLevel = knowledgeLevel;
	}

	public String getKnowledgeLevel() {
		return knowledgeLevel;
	}

	public void setTrailerVideo(String trailerVideo) {
		this.trailerVideo = trailerVideo;
	}

	public String getTrailerVideo() {
		return trailerVideo;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setVerifications(List<VerificationsItem> verifications) {
		this.verifications = verifications;
	}

	public List<VerificationsItem> getVerifications() {
		return verifications;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setEctsAvailable(String ectsAvailable) {
		this.ectsAvailable = ectsAvailable;
	}

	public String getEctsAvailable() {
		return ectsAvailable;
	}

	public void setInstructors(List<InstructorsItem> instructors) {
		this.instructors = instructors;
	}

	public List<InstructorsItem> getInstructors() {
		return instructors;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getCover() {
		return cover;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDuration() {
		return duration;
	}

	public void setOrganisations(List<OrganisationsItem> organisations) {
		this.organisations = organisations;
	}

	public List<OrganisationsItem> getOrganisations() {
		return organisations;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStartDate() {
		return startDate;
	}

//	@Override
// 	public String toString(){
//		return
//			"CoursesItem{" +
//			"end_date = '" + endDate + '\'' +
//			",image = '" + image + '\'' +
//			",knowledge_level = '" + knowledgeLevel + '\'' +
//			",trailer_video = '" + trailerVideo + '\'' +
//			",description = '" + description + '\'' +
//			",language = '" + language + '\'' +
//			",discipline = '" + discipline + '\'' +
//			",title = '" + title + '\'' +
//			",verifications = '" + verifications + '\'' +
//			",url = '" + url + '\'' +
//			",ects_available = '" + ectsAvailable + '\'' +
//			",instructors = '" + instructors + '\'' +
//			",cover = '" + cover + '\'' +
//			",duration = '" + duration + '\'' +
//			",organisations = '" + organisations + '\'' +
//			",subtitle = '" + subtitle + '\'' +
//			",id = '" + id + '\'' +
//			",state = '" + state + '\'' +
//			",start_date = '" + startDate + '\'' +
//			"}";
//		}
}