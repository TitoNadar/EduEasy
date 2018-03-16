package tito.example.com.edueasy.Interface;

import retrofit2.Call;
import retrofit2.http.GET;
import tito.example.com.edueasy.Modal.udacity.Response;


/**
 * Created by tito on 16/3/18.
 */

public interface Udacity_Service {
    @GET("courses")
    Call<Response> getUdacityService();
}
