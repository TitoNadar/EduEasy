package tito.example.com.edueasy.Interface;

import retrofit2.Call;
import retrofit2.http.GET;
import tito.example.com.edueasy.Modal.News.Response;

/**
 * Created by tito on 17/3/18.
 */

public interface NewsService {
    @GET("top-headlines?sources=techcrunch&apiKey=9c4649f81c00464a814e84614efc7e00")
    Call<Response> getNews();
}
