package tito.example.com.edueasy.Modal.udacity;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class CoursesItem{

	@SerializedName("syllabus")
	private String syllabus;

	@SerializedName("featured")
	private boolean featured;

	@SerializedName("project_name")
	private String projectName;

	@SerializedName("title")
	private String title;

	@SerializedName("instructors")
	private List<InstructorsItem> instructors;

	@SerializedName("faq")
	private String faq;

	@SerializedName("expected_duration_unit")
	private String expectedDurationUnit;

	@SerializedName("expected_duration")
	private int expectedDuration;

	@SerializedName("required_knowledge")
	private String requiredKnowledge;

	@SerializedName("banner_image")
	private String bannerImage;

	@SerializedName("key")
	private String key;

	@SerializedName("short_summary")
	private String shortSummary;

	@SerializedName("slug")
	private String slug;

	@SerializedName("summary")
	private String summary;

	@SerializedName("image")
	private String image;

	@SerializedName("starter")
	private boolean starter;

	@SerializedName("level")
	private String level;

	@SerializedName("related_degree_keys")
	private List<Object> relatedDegreeKeys;

	@SerializedName("tracks")
	private List<Object> tracks;

	@SerializedName("project_description")
	private String projectDescription;

	@SerializedName("new_release")
	private boolean newRelease;

	@SerializedName("subtitle")
	private String subtitle;

	@SerializedName("expected_learning")
	private String expectedLearning;

	@SerializedName("teaser_video")
	private TeaserVideo teaserVideo;

	@SerializedName("affiliates")
	private List<AffiliatesItem> affiliates;

	@SerializedName("full_course_available")
	private boolean fullCourseAvailable;

	@SerializedName("homepage")
	private String homepage;

	public void setSyllabus(String syllabus){
		this.syllabus = syllabus;
	}

	public String getSyllabus(){
		return syllabus;
	}

	public void setFeatured(boolean featured){
		this.featured = featured;
	}

	public boolean isFeatured(){
		return featured;
	}

	public void setProjectName(String projectName){
		this.projectName = projectName;
	}

	public String getProjectName(){
		return projectName;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setInstructors(List<InstructorsItem> instructors){
		this.instructors = instructors;
	}

	public List<InstructorsItem> getInstructors(){
		return instructors;
	}

	public void setFaq(String faq){
		this.faq = faq;
	}

	public String getFaq(){
		return faq;
	}

	public void setExpectedDurationUnit(String expectedDurationUnit){
		this.expectedDurationUnit = expectedDurationUnit;
	}

	public String getExpectedDurationUnit(){
		return expectedDurationUnit;
	}

	public void setExpectedDuration(int expectedDuration){
		this.expectedDuration = expectedDuration;
	}

	public int getExpectedDuration(){
		return expectedDuration;
	}

	public void setRequiredKnowledge(String requiredKnowledge){
		this.requiredKnowledge = requiredKnowledge;
	}

	public String getRequiredKnowledge(){
		return requiredKnowledge;
	}

	public void setBannerImage(String bannerImage){
		this.bannerImage = bannerImage;
	}

	public String getBannerImage(){
		return bannerImage;
	}

	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return key;
	}

	public void setShortSummary(String shortSummary){
		this.shortSummary = shortSummary;
	}

	public String getShortSummary(){
		return shortSummary;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}

	public void setSummary(String summary){
		this.summary = summary;
	}

	public String getSummary(){
		return summary;
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setStarter(boolean starter){
		this.starter = starter;
	}

	public boolean isStarter(){
		return starter;
	}

	public void setLevel(String level){
		this.level = level;
	}

	public String getLevel(){
		return level;
	}

	public void setRelatedDegreeKeys(List<Object> relatedDegreeKeys){
		this.relatedDegreeKeys = relatedDegreeKeys;
	}

	public List<Object> getRelatedDegreeKeys(){
		return relatedDegreeKeys;
	}

	public void setTracks(List<Object> tracks){
		this.tracks = tracks;
	}

	public List<Object> getTracks(){
		return tracks;
	}

	public void setProjectDescription(String projectDescription){
		this.projectDescription = projectDescription;
	}

	public String getProjectDescription(){
		return projectDescription;
	}

	public void setNewRelease(boolean newRelease){
		this.newRelease = newRelease;
	}

	public boolean isNewRelease(){
		return newRelease;
	}

	public void setSubtitle(String subtitle){
		this.subtitle = subtitle;
	}

	public String getSubtitle(){
		return subtitle;
	}

	public void setExpectedLearning(String expectedLearning){
		this.expectedLearning = expectedLearning;
	}

	public String getExpectedLearning(){
		return expectedLearning;
	}

	public void setTeaserVideo(TeaserVideo teaserVideo){
		this.teaserVideo = teaserVideo;
	}

	public TeaserVideo getTeaserVideo(){
		return teaserVideo;
	}

	public void setAffiliates(List<AffiliatesItem> affiliates){
		this.affiliates = affiliates;
	}

	public List<AffiliatesItem> getAffiliates(){
		return affiliates;
	}

	public void setFullCourseAvailable(boolean fullCourseAvailable){
		this.fullCourseAvailable = fullCourseAvailable;
	}

	public boolean isFullCourseAvailable(){
		return fullCourseAvailable;
	}

	public void setHomepage(String homepage){
		this.homepage = homepage;
	}

	public String getHomepage(){
		return homepage;
	}

//	@Override
// 	public String toString(){
//		return
//			"CoursesItem{" +
//			"syllabus = '" + syllabus + '\'' +
//			",featured = '" + featured + '\'' +
//			",project_name = '" + projectName + '\'' +
//			",title = '" + title + '\'' +
//			",instructors = '" + instructors + '\'' +
//			",faq = '" + faq + '\'' +
//			",expected_duration_unit = '" + expectedDurationUnit + '\'' +
//			",expected_duration = '" + expectedDuration + '\'' +
//			",required_knowledge = '" + requiredKnowledge + '\'' +
//			",banner_image = '" + bannerImage + '\'' +
//			",key = '" + key + '\'' +
//			",short_summary = '" + shortSummary + '\'' +
//			",slug = '" + slug + '\'' +
//			",summary = '" + summary + '\'' +
//			",image = '" + image + '\'' +
//			",starter = '" + starter + '\'' +
//			",level = '" + level + '\'' +
//			",related_degree_keys = '" + relatedDegreeKeys + '\'' +
//			",tracks = '" + tracks + '\'' +
//			",project_description = '" + projectDescription + '\'' +
//			",new_release = '" + newRelease + '\'' +
//			",subtitle = '" + subtitle + '\'' +
//			",expected_learning = '" + expectedLearning + '\'' +
//			",teaser_video = '" + teaserVideo + '\'' +
//			",affiliates = '" + affiliates + '\'' +
//			",full_course_available = '" + fullCourseAvailable + '\'' +
//			",homepage = '" + homepage + '\'' +
//			"}";
//		}
}