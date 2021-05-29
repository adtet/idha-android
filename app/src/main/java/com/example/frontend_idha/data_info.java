package com.example.frontend_idha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class data_info extends AppCompatActivity {
    public String url = MainActivity.url;
    TextView txtsuhu,txtkelembapan,txthujan,txtcahaya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_info);
        txtsuhu = findViewById(R.id.txtsuhuinfo);
        txtkelembapan = findViewById(R.id.txtkelembapaninfo);
        txthujan = findViewById(R.id.txthujaninfo);
        txtcahaya = findViewById(R.id.txtcahayainfo);
        node1();
        node2();
        node3();

    }

    public void node1(){
        final Retrofit retrofit = new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
        jsonplaceholder jsonplaceholder = retrofit.create(com.example.frontend_idha.jsonplaceholder.class);
        Call<getNode1>call = jsonplaceholder.getnode1();
        call.enqueue(new Callback<getNode1>() {
            @Override
            public void onResponse(Call<getNode1> call, Response<getNode1> response) {
                getNode1 getNode1 = response.body();
                txtkelembapan.setText(getNode1.getKelembapan());
                txtsuhu.setText(getNode1.getSuhu());
            }

            @Override
            public void onFailure(Call<getNode1> call, Throwable t) {

            }
        });

    }

    public void node2(){
        final Retrofit retrofit = new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
        jsonplaceholder jsonplaceholder = retrofit.create(com.example.frontend_idha.jsonplaceholder.class);
        Call<getNode2>call = jsonplaceholder.getnode2();
        call.enqueue(new Callback<getNode2>() {
            @Override
            public void onResponse(Call<getNode2> call, Response<getNode2> response) {
                getNode2 getNode2 = response.body();
                txthujan.setText(getNode2.getHujan());
            }

            @Override
            public void onFailure(Call<getNode2> call, Throwable t) {

            }
        });
    }

    public void node3(){
        final Retrofit retrofit = new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
        jsonplaceholder jsonplaceholder = retrofit.create(com.example.frontend_idha.jsonplaceholder.class);
        Call<getNode3>call = jsonplaceholder.getnode3();
        call.enqueue(new Callback<getNode3>() {
            @Override
            public void onResponse(Call<getNode3> call, Response<getNode3> response) {
                getNode3 getNode3 = response.body();
                txtcahaya.setText(getNode3.getCahaya());
            }

            @Override
            public void onFailure(Call<getNode3> call, Throwable t) {

            }
        });
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}