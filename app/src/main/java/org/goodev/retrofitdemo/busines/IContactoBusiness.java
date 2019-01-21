package org.goodev.retrofitdemo.busines;

import org.goodev.retrofitdemo.model.Contacto;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

public interface IContactoBusiness {
    @GET("/contacts/{id}")
    List<Contacto> contacts(@Path("id") String id);

    @GET("/contacts/{id}")
    void contacts(@Path("id") String id, Callback<List<Contacto>> callback);

    @GET("/contacts")
    void contacts(Callback<List<Contacto>> callback);
}
