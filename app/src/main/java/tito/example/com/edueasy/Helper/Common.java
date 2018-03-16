package tito.example.com.edueasy.Helper;

import tito.example.com.edueasy.Interface.Udacity_Service;
import tito.example.com.edueasy.Remote.RetrofitClient;

/**
 * Created by tito on 16/3/18.
 */

public class Common {
    private static String Udacity_Url="https://www.udacity.com/public-api/v0/";

    public static Udacity_Service getUdacityCourses()
    {
        return RetrofitClient.getclient(Udacity_Url).create(Udacity_Service.class);
    }

}
