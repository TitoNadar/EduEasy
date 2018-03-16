package tito.example.com.edueasy.Modal.Books;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Response{

	@SerializedName("Total")
	private String total;

	@SerializedName("Error")
	private String error;

	@SerializedName("Time")
	private double time;

	@SerializedName("Page")
	private int page;

	@SerializedName("Books")
	private List<BooksItem> books;

	public void setTotal(String total){
		this.total = total;
	}

	public String getTotal(){
		return total;
	}

	public void setError(String error){
		this.error = error;
	}

	public String getError(){
		return error;
	}

	public void setTime(double time){
		this.time = time;
	}

	public double getTime(){
		return time;
	}

	public void setPage(int page){
		this.page = page;
	}

	public int getPage(){
		return page;
	}

	public void setBooks(List<BooksItem> books){
		this.books = books;
	}

	public List<BooksItem> getBooks(){
		return books;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"total = '" + total + '\'' + 
			",error = '" + error + '\'' + 
			",time = '" + time + '\'' + 
			",page = '" + page + '\'' + 
			",books = '" + books + '\'' + 
			"}";
		}
}