package tito.example.com.edueasy.Interface;

import retrofit2.Call;
import retrofit2.http.GET;
import tito.example.com.edueasy.Modal.Books.Response;

/**
 * Created by tito on 16/3/18.
 */

public interface Book_Service {


@GET("android")
    Call<Response> getBooksService();

}
