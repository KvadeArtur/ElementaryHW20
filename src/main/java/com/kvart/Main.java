package com.kvart;

import com.kvart.User.User;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyApiService service = MyApiService.getInstance();

        List<Post> posts = service.getPosts();
        System.out.println(posts);

        List<Comment> comments = service.getComments();
        System.out.println(comments);

        List<Album> albums = service.getAlbums();
        System.out.println(albums);

        List<Photo> photos = service.getPhotos();
        System.out.println(photos);

        List<User> users = service.getUsers();
        System.out.println(users);

        List<Todo> todos = service.getTodos();
        System.out.println(todos);
    }
}
