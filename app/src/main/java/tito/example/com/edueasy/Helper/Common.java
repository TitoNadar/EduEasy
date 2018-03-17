package tito.example.com.edueasy.Helper;

import tito.example.com.edueasy.Interface.Book_Service;
import tito.example.com.edueasy.Interface.IversitySErvice;
import tito.example.com.edueasy.Interface.NewsService;
import tito.example.com.edueasy.Interface.Stack_Service;
import tito.example.com.edueasy.Interface.Udacity_Service;
import tito.example.com.edueasy.Remote.BookClient;
import tito.example.com.edueasy.Remote.RetrofitClient;
import tito.example.com.edueasy.Remote.StackClient;

/**
 * Created by tito on 16/3/18.
 */

public class Common {
    private static String Udacity_Url="https://www.udacity.com/public-api/v0/";
    private static String Iversity_Url="https://iversity.org/api/v1/";
    private static String Books_Url="https://it-ebooks-api.info/v1/search/";
   private static String StackOverFlow="https://api.stackexchange.com/2.2/search/";
   private static String News_Url = "https://newsapi.org/v2/";
    public static Udacity_Service getUdacityCourses()
    {
        return RetrofitClient.getclient(Udacity_Url).create(Udacity_Service.class);
    }
    public static IversitySErvice getIversityCourses()
    {
        return RetrofitClient.getclient(Iversity_Url).create(IversitySErvice.class);
    }
    public static Stack_Service getStackDoubts()
    {
        return StackClient.getclient(StackOverFlow).create(Stack_Service.class);
    }
    public static Book_Service getBooks()
    {
        return BookClient.getclient(Books_Url).create(Book_Service.class);
    }
    public static NewsService getarticles()
    {
        return RetrofitClient.getclient(News_Url).create(NewsService.class);
    }

    public static final String API_KEY = "aeb3a90e400442b5a57644f770d9bbc5";

    public static String getAPIUrl(String source,String apiKEY){
        StringBuilder apiUrl= new StringBuilder("https://newsapi.org/v2/top-headlines?sources=")
                .append(source);
        return apiUrl.append("&apiKey=")
                .append(apiKEY).toString();
    }
}
