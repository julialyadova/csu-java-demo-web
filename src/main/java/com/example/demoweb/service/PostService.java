package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import com.example.demoweb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    List<Post> posts;
    @Autowired
    PostRepository postRepository;

    public PostService() {
        this.posts = new ArrayList<>();
    }

    public Iterable<Post> listAllPosts() {
        return postRepository.findAll();
    }

    public void create(String text) {
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }
}
