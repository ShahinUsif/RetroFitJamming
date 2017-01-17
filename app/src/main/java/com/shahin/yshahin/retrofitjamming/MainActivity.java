package com.shahin.yshahin.retrofitjamming;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.shahin.yshahin.retrofitjamming.Entities.InvitationsContainer;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL = "http://194.165.153.18:8181/AndroidWCFRestfull/AAPRestFullHttp.svc/";

    TextView tvDataBody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService(new Intent(this, LocationService.class));

        tvDataBody = (TextView) findViewById(R.id.tv_data_body);

        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        AAPRestfulEndPointInterface service = retrofit.create(AAPRestfulEndPointInterface.class);


        final Call<InvitationsContainer> apiCall = service.GetListInvititionFiltered("1", "104", "", "", "", "", "", "", "", "", "01/01/2017","01/02/2017", "", "DB01-SRV", "AAP");

        String url = apiCall.request().url().toString();
        Log.i("RETROFIT", url);

        apiCall.enqueue(new Callback<InvitationsContainer>() {
            @Override
            public void onResponse(Call<InvitationsContainer> call, Response<InvitationsContainer> response) {

                Log.i("RETROFIT", "onResponse Called");
                InvitationsContainer result = response.body();

                tvDataBody.setText(result.toString());
            }

            @Override
            public void onFailure(Call<InvitationsContainer> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Service Call Failure \n" + t.getMessage(), Toast.LENGTH_LONG).show();
                Log.e("RETROFIT", t.getMessage());

            }
        });


    }
}
