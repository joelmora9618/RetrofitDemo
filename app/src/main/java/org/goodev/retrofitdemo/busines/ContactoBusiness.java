package org.goodev.retrofitdemo.busines;

import org.goodev.retrofitdemo.model.Contacto;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;

import static org.goodev.retrofitdemo.GitHubClient.API_URL;

public class ContactoBusiness implements IContactoBusiness{

    public static ContactoBusiness newInstance(){
        return new ContactoBusiness();
    }

    @Override
    public List<Contacto> contacts(String id) {
        RestAdapter restAdapter = new RestAdapter.Builder().setServer(API_URL).build();
        IContactoBusiness contactoBusiness = restAdapter.create(IContactoBusiness.class);
        return contactoBusiness.contacts(id);
    }

    @Override
    public void contacts(String id, Callback<List<Contacto>> callback) {
        RestAdapter restAdapter = new RestAdapter.Builder().setServer(API_URL).build();
        IContactoBusiness contactoBusiness = restAdapter.create(IContactoBusiness.class);
        contactoBusiness.contacts(id,callback);
    }

    @Override
    public void contacts(Callback<List<Contacto>> callback) {
        RestAdapter restAdapter = new RestAdapter.Builder().setServer(API_URL).build();
        IContactoBusiness contactoBusiness = restAdapter.create(IContactoBusiness.class);
        contactoBusiness.contacts(callback);
    }
}
