package tito.example.com.edueasy.Interface;

import retrofit.http.GET;
import tito.example.com.edueasy.Modal.udacity.Response;


/**
 * Created by tito on 16/3/18.
 */

public interface Udacity_Service {
    @GET()
    Class<Response> getResponse();
}
