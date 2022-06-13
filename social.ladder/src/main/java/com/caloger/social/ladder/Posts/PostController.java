package com.caloger.social.ladder.Posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@RequestMapping("/post/")
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public Optional<PostModel> getPost(Long Id) {
        return postService.readPost(Id);
    }

    @DeleteMapping("/delete/:id")
    public void deletePost(Long id) {
        postService.deletePost(id);
    }

    @PostMapping("/create")
    public PostModel createPost(PostModel postModel) {
        return postService.createPost(postModel);
    }
}
