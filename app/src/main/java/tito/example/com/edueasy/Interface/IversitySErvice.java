package tito.example.com.edueasy.Interface;

import retrofit2.Call;
import retrofit2.http.GET;
import tito.example.com.edueasy.Modal.Iversity.Response;

/**
 * Created by tito on 16/3/18.
 */

public interface IversitySErvice {

    @GET("courses")
    Call<Response> getIversityService();
}
