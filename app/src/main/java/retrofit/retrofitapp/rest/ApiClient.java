package retrofit.retrofitapp.rest;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiClient {

    //public static final String BASE_URL = "http://api.themoviedb.org/3/";
    //public static final String BASE_URL = "http://rameshbookmeds-001-site1.ftempurl.com/api/";
    public static final String GET_ALL_MYLIST = "User/GetPharmacyRunningList";

    public static final String BASE_URL = "http://xamprdemo.cloudapp.net/";
    public static final String REGISTER_USER_URL = "api/UserRegistration/RegisterUser";
    public static final String XWALL_ACTIVITIES_URL = "api/ActivityParticipation/GetXWallActivities";
    public static final String ACTIVITIES_USERS_URL = "api/ActivityParticipation/GetAllActivityUsers";

    public static final String XWALLGET = "?versionNumber={VersionCode}&deviceType=Android&lastReadTimeInTics=0";


    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit == null) {

            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            // set your desired log level
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);


            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(10, TimeUnit.SECONDS)
                    .readTimeout(10, TimeUnit.SECONDS)
                    // add logging as last interceptor
                    .addInterceptor(logging)
                    .build();

          /*  OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(10, TimeUnit.SECONDS)
                    .readTimeout(10, TimeUnit.SECONDS)
                    .build();*/

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit;
    }

   /* private OkHttpClient getHttpClient() {
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(5, TimeUnit.SECONDS)
                .readTimeout(5, TimeUnit.SECONDS)
                .build();
        return client;
    }*/
}

//Log Levels
//NONE, BASIC, HEADERS, BODY.
//None - No logging.
//Basic -Log request type, url, size of request body, response status and size of response body.
//Headers-Log request and response headers, request type, url, response status.
//Body -Log request and response headers and body.
