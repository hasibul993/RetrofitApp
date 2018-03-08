package retrofit.retrofitapp.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.List;

import retrofit.retrofitapp.R;
import retrofit.retrofitapp.model.ActivityUsers;
import retrofit.retrofitapp.model.HomeModel;
import retrofit.retrofitapp.model.HomeResponseModel;
import retrofit.retrofitapp.model.PharmacyModel;
import retrofit.retrofitapp.model.UserRegistrationEntity;
import retrofit.retrofitapp.rest.ApiClient;
import retrofit.retrofitapp.rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiInterface apiService;

    String token = "eyJhbGciOiJSUzI1NiIsImtpZCI6IjQzZTFiMGIyOTllNDIxZjU2ZWI1YTQ2NjhkMWNmMjNmNGFjNjk2NGMifQ.eyJpc3MiOiJodHRwczovL3NlY3VyZXRva2VuLmdvb2dsZS5jb20veGFtcHItN2Y1MGUiLCJhdWQiOiJ4YW1wci03ZjUwZSIsImF1dGhfdGltZSI6MTUyMDUwMjMyNCwidXNlcl9pZCI6IlNTbmYyT29lS0RhTWlzQWxWc0d6cGwyc1R1YTIiLCJzdWIiOiJTU25mMk9vZUtEYU1pc0FsVnNHenBsMnNUdWEyIiwiaWF0IjoxNTIwNTAyMzI3LCJleHAiOjE1MjA1MDU5MjcsInBob25lX251bWJlciI6Iis5MTcyMDc3MDc4MTIiLCJmaXJlYmFzZSI6eyJpZGVudGl0aWVzIjp7InBob25lIjpbIis5MTcyMDc3MDc4MTIiXX0sInNpZ25faW5fcHJvdmlkZXIiOiJwaG9uZSJ9fQ.SmLsLvCKqK4rAEGO8sjzpgJQZ2hSmEBc-Le-l-RDlqkEES0u9_CJ2_kOc1pbOp4PWC2-80IZNDw1VaLRUWBoYICMFDa4OSFHQqdiFUMxUDlzOi73a1yZAOYPR8j2jKMz2giqdK0Ro1fkA-1vvW6L39YVpf43uXYVoUpTwbdn80rVcSp4gJTFn--MT-GaCCDRLWEr9BG2kL2_xbWRNpYA2-6biG-Iylu9KppiKkFj5ChIvSdrbbuuQAuXVWDHC0FdxrTc0XcQMCrmTTEPRhkY6-azILORkwT3u5xY871k3Jvep0I5q7fIxA2FH_Ol6yLEudh50EetPGGlj-LVQQvE6w";

    String serverToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJ4YW1wciIsInVuaXF1ZV9uYW1lIjoiNzIwNzcwNzgxMiIsInVzZXJJZCI6IjcyMDc3MDc4MTIiLCJkZXZpY2VJZCI6IjkxMTU0MTcwMTgyMjAzNCIsInRpbWUiOiIzLzgvMjAxOCAxOjAzOjEwIFBNIiwiZXhwIjoxNTIwNjAwNTkwLCJuYmYiOjE1MjA1MTQxOTB9.FhWaqFsgEWI6vfWu8S6dh0mClRqnJifPy1m_oO_RHXI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.TextV);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetXwall();
            }
        });

        apiService = ApiClient.getClient().create(ApiInterface.class);


    }

    public static void Refresh(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    public void GetActivityUsers() {
        try {

            HomeModel homeModel = new HomeModel();
            homeModel.userGuid = "99ffdb0c-65fd-48b1-a9b8-e63fca0a520f";
            homeModel.activityGuid = "0e5f4259-254e-480a-a37f-78d679574423";

            Gson gson = new Gson();
            String json = gson.toJson(homeModel);

            Call<ActivityUsers> call = apiService.GetActUsers(serverToken, homeModel);
            call.enqueue(new Callback<ActivityUsers>() {
                @Override
                public void onResponse(Call<ActivityUsers> call, Response<ActivityUsers> response) {
                    int statusCode = response.code();
                    // String success = response.body().Status;
                    //UserRegistrationEntity userRegistrationEntity1 = response.body().Response;
                    Log.e("TAG", response.toString());
                    //List<Movie> movies = response.body().getResults();
                }

                @Override
                public void onFailure(Call<ActivityUsers> call, Throwable t) {
                    // Log error here since request failed
                    Log.e("TAG", t.toString());
                }
            });

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void GetPharmacyList() {
        try {

            PharmacyModel pharmacyModel = new PharmacyModel();
            pharmacyModel.DistributorID = "1";
            pharmacyModel.LastUpdatedTimeTicks = "0";
            pharmacyModel.UserID = "2";
            pharmacyModel.PharmacyID = "2";


            Call<PharmacyModel> call = apiService.GetPharmacyList(pharmacyModel);
            call.enqueue(new Callback<PharmacyModel>() {
                @Override
                public void onResponse(Call<PharmacyModel> call, Response<PharmacyModel> response) {
                    int statusCode = response.code();
                    // String success = response.body().Status;
                    //UserRegistrationEntity userRegistrationEntity1 = response.body().Response;
                    Log.e("TAG", response.toString());
                    //List<Movie> movies = response.body().getResults();
                }

                @Override
                public void onFailure(Call<PharmacyModel> call, Throwable t) {
                    // Log error here since request failed
                    Log.e("TAG", t.toString());
                }
            });

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void GetXwall() {
        try {

            HomeModel homeModel = new HomeModel();
            homeModel.DeviceType = "Android";
            homeModel.lastReadTimeInTics = "0";
            homeModel.VersionNumber = 61;
            homeModel.userGuid = "99ffdb0c-65fd-48b1-a9b8-e63fca0a520f";
            //homeModel.activityGuid = "0e5f4259-254e-480a-a37f-78d679574423";

            // String query = "?versionNumber=" + 61 + "&deviceType=Android" + "&lastReadTimeInTics=0";
            Call<HomeResponseModel> call = apiService.GetXWallActivities(serverToken, 61);
            call.enqueue(new Callback<HomeResponseModel>() {
                @Override
                public void onResponse(Call<HomeResponseModel> call, Response<HomeResponseModel> response) {
                    int statusCode = response.code();
                    // String success = response.body().Status;
                    //UserRegistrationEntity userRegistrationEntity1 = response.body().Response;
                    Log.e("TAG", response.toString());
                    //List<Movie> movies = response.body().getResults();
                }

                @Override
                public void onFailure(Call<HomeResponseModel> call, Throwable t) {
                    // Log error here since request failed
                    Log.e("TAG", t.toString());
                }
            });

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void RegisterUser() {
        try {

            UserRegistrationEntity userRegistrationEntity = new UserRegistrationEntity();
            userRegistrationEntity.setDeviceID("APA91bHJSdkpiAQhFOv66jlHjlW7KWGX78Zgaqh41LIs-rS0VZcD33xIIMY85l-JiceMDRxeNwdg7XjOICGmlDOoj8DtgrNd_7ug_j4xarXNwlsU_s_i4AU");
            userRegistrationEntity.setDeviceType("Android");
            userRegistrationEntity.setDeviceUniqueID("911541701822034");
            userRegistrationEntity.setPhoneNumber("+918801877978");
            userRegistrationEntity.setToken(token);

            Call<UserRegistrationEntity> call = apiService.CreateUser(userRegistrationEntity);
            call.enqueue(new Callback<UserRegistrationEntity>() {
                @Override
                public void onResponse(Call<UserRegistrationEntity> call, Response<UserRegistrationEntity> response) {
                    int statusCode = response.code();
                    String success = response.body().Status;
                    UserRegistrationEntity userRegistrationEntity1 = response.body().Response;
                    Log.e("TAG", response.toString());
                    //List<Movie> movies = response.body().getResults();
                }

                @Override
                public void onFailure(Call<UserRegistrationEntity> call, Throwable t) {
                    // Log error here since request failed
                    Log.e("TAG", t.toString());
                }
            });

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

