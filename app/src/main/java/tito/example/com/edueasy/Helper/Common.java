package tito.example.com.edueasy.Helper;

import tito.example.com.edueasy.Interface.Book_Service;
import tito.example.com.edueasy.Interface.IversitySErvice;
import tito.example.com.edueasy.Interface.Stack_Service;
import tito.example.com.edueasy.Interface.Udacity_Service;
import tito.example.com.edueasy.Remote.RetrofitClient;

/**
 * Created by tito on 16/3/18.
 */

public class Common {
    private static String Udacity_Url="https://www.udacity.com/public-api/v0/";
    private static String Iversity_Url="https://iversity.org/api/v1/";
    private static String Books_Url="http://it-ebooks-api.info/";
   private static String StackOverFlow="https://api.stackexchange.com/2.2/search/advanced?order=desc&site=stackoverflow&accepted=False&sort=activity";
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
        return RetrofitClient.getclient(StackOverFlow).create(Stack_Service.class);
    }
    public static Book_Service getBooks()
    {
        return RetrofitClient.getclient(Books_Url).create(Book_Service.class);
    }
}
