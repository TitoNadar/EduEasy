package tito.example.com.edueasy.Interface;

import retrofit2.Call;
import retrofit2.http.GET;
import tito.example.com.edueasy.Modal.StackOverFlow.Response;

/**
 * Created by tito on 16/3/18.
 */

public interface Stack_Service {
    @GET("advanced?order=desc&site=stackoverflow&accepted=False&sort=activity&q=android%20OR%20Blockchain%20OR%20web")
    Call<Response> getStackService();
}
