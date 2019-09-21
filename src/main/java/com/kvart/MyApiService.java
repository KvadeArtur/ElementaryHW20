package com.kvart;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kvart.User.User;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class MyApiService {

    private static MyApiService instance;

    public static MyApiService getInstance() {
        if (instance == null) {
            instance = new MyApiService();
        }
        return instance;
    }

    private MyApiService() {
        
    }

    public List<Post> getPosts() {
        String json = HttpUtil.sendRequest("https://jsonplaceholder.typicode.com/posts");
        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Post>>(){}.getType();
        return gson.fromJson(json, listType);
    }

    public List<Comment> getComments() {
        String json = HttpUtil.sendRequest("https://jsonplaceholder.typicode.com/comments");
        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Comment>>(){}.getType();
        return gson.fromJson(json, listType);
    }

    public List<Album> getAlbums() {
        String json = HttpUtil.sendRequest("https://jsonplaceholder.typicode.com/albums");
        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Album>>(){}.getType();
        return gson.fromJson(json, listType);
    }

    public List<Photo> getPhotos() {
        String json = HttpUtil.sendRequest("https://jsonplaceholder.typicode.com/photos");
        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Photo>>(){}.getType();
        return gson.fromJson(json, listType);
    }

    public List<User> getUsers() {
        String json = HttpUtil.sendRequest("https://jsonplaceholder.typicode.com/users");
        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<User>>(){}.getType();
        return gson.fromJson(json, listType);
    }

    public List<Todo> getTodos() {
        String json = HttpUtil.sendRequest("https://jsonplaceholder.typicode.com/todos");
        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Todo>>(){}.getType();
        return gson.fromJson(json, listType);
    }
}
