/*
 * Copyright (C) 2012 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.goodev.retrofitdemo;

import org.goodev.retrofitdemo.model.Contacto;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Path;

public class GitHubClient {
    private static final String API_URL = "https://private-d0cc1-iguanafixtest.apiary-mock.com";

    interface GitHub {
        @GET("/contacts/{id}")
        List<Contacto> contacts(@Path("id") String id);

        @GET("/contacts/{id}")
        void contacts(@Path("id") String id, Callback<List<Contacto>> callback);

        @GET("/contacts")
        void contacts(Callback<List<Contacto>> callback);
    }

    public static void getContributors(Callback<List<Contacto>> callback) {
        // Create a very simple REST adapter which points the GitHub API
        // endpoint.
        RestAdapter restAdapter = new RestAdapter.Builder().setServer(API_URL).build();

        // Create an instance of our GitHub API interface.
        GitHub github = restAdapter.create(GitHub.class);

        // Fetch and print a list of the contributors to this library.
        github.contacts(callback);

    }
}
