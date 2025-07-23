package org.baljaguk.controller;

import org.baljaguk.domain.Post;
import org.baljaguk.service.PostService;

import java.util.List;

public class PostController {
    private final PostService postService = new PostService();

    public void createPost(final String title) {
        postService.createPost(title);
    }

    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    public Post getPostById(int id) {
        return postService.getPostById(id);
    }

}

