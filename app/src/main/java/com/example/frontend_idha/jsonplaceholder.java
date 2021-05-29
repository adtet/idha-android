package com.example.frontend_idha;

import retrofit2.Call;
import retrofit2.http.GET;

public interface jsonplaceholder {
    @GET("ida/welcome")
    Call<getWelcome>getwelcome();
    @GET("ida/get/node1")
    Call<getNode1>getnode1();
    @GET("ida/get/node2")
    Call<getNode2>getnode2();
    @GET("ida/get/node3")
    Call<getNode3>getnode3();
}
