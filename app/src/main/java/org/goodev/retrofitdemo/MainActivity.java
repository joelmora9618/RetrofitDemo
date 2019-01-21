package org.goodev.retrofitdemo;

import java.util.List;

import org.goodev.retrofitdemo.busines.ContactoBusiness;
import org.goodev.retrofitdemo.model.Contacto;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mListView = getListView();
        ContactoBusiness.newInstance().contacts(callback);
    }

    Callback<List<Contacto>> callback = new Callback<List<Contacto>>() {

        @Override
        public void success(List<Contacto> contributors, Response response) {
            ArrayAdapter<Contacto> adapter = new ArrayAdapter<Contacto>(getApplicationContext(),
                    android.R.layout.simple_list_item_1, contributors);
            mListView.setAdapter(adapter);
        }

        @Override
        public void failure(RetrofitError error) {
        }
    };

}
