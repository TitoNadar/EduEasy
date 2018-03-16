package tito.example.com.edueasy.Interface;

import retrofit.Call;
import retrofit.http.GET;
import tito.example.com.edueasy.Modal.Iversity.Response;

/**
 * Created by tito on 16/3/18.
 */

public interface IversitySErvice {

    @GET("courses")
    Call<Response> getIversityService();
}
