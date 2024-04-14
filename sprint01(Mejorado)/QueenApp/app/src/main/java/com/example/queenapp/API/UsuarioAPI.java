package com.example.queenapp.API;

import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.Call;
import com.example.queenapp.Usuario;
import retrofit2.http.Body;
import retrofit2.http.Path;

public interface UsuarioAPI {
    @POST("registrarUsuario")
    Call<Usuario> setContacto(@Body Usuario usuario);
    @GET("ingresarUsuario")
    Call<ResponseBody> getPredict(@Body Usuario usuario);
}
