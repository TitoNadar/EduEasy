package tito.example.com.edueasy.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by tito on 17/3/18.
 */

public class BookClient {
    private static Retrofit retrofit=null;
    public static Retrofit getclient(String baseUrl)
    {
        //Base URLs should always end in /.
        if(retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
