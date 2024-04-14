package com.example.queenapp.API;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
public class RetrofitUsuario {
    private static Retrofit salidaRetrofit;

    public static Retrofit getInstance() {
        if (salidaRetrofit == null) {
            salidaRetrofit = new Retrofit.Builder().
                    baseUrl("https://tictactoe-web-dakb.onrender.com/QueenApp/").
                    addConverterFactory(GsonConverterFactory.create()).
                    addCallAdapterFactory(RxJava2CallAdapterFactory.create()).
                    build();
        }
        return salidaRetrofit;
    }
    private RetrofitUsuario(){}
}
