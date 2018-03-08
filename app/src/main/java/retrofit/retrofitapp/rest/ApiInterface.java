package retrofit.retrofitapp.rest;

import java.util.List;

import retrofit.retrofitapp.model.ActivityUsers;
import retrofit.retrofitapp.model.HomeModel;
import retrofit.retrofitapp.model.HomeResponseModel;
import retrofit.retrofitapp.model.PharmacyModel;
import retrofit.retrofitapp.model.UserRegistrationEntity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {
    @GET("movie/top_rated")
    Call<UserRegistrationEntity> RegisterUserAPI(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<UserRegistrationEntity> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);

    public void registration(@Field("name") String name,
                             @Field("email") String email,
                             @Field("password") String password,
                             @Field("logintype") String logintype,
                             Callback<UserRegistrationEntity> callback);

    @POST(ApiClient.REGISTER_USER_URL)
    Call<UserRegistrationEntity> CreateUser(@Body UserRegistrationEntity user);

    @GET(ApiClient.XWALL_ACTIVITIES_URL+ApiClient.XWALLGET)
    Call<HomeResponseModel> GetXWallActivities(@Header("token") String token, @Query("versionNumber") int VersionCode);


    @POST(ApiClient.ACTIVITIES_USERS_URL)
    Call<ActivityUsers> GetActUsers(@Header("token") String token, @Body HomeModel homeModel);

    @POST(ApiClient.GET_ALL_MYLIST)
    Call<PharmacyModel> GetPharmacyList(@Body PharmacyModel pharmacyModel);
}
