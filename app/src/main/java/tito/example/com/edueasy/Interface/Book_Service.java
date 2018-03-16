package tito.example.com.edueasy.Interface;

import retrofit.Call;
import retrofit.http.GET;
import tito.example.com.edueasy.Modal.Books.Response;

/**
 * Created by tito on 16/3/18.
 */

public interface Book_Service {
@GET("v1/search/android")
    Call<Response> getBookService();
@GET("v1/search/")
    Call<Response> getSpecialBooksService();

}
