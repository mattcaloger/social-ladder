package com.caloger.social.ladder.Posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public PostModel createPost(PostModel post) {
        return this.postRepository.save(post);
    }

    public Optional<PostModel> readPost(Long id) {
        return this.postRepository.findById(id);
    }

    public Iterable<PostModel> readAllPosts() {
        return this.postRepository.findAll();
    }

    public PostModel updatePost(PostModel postModel) {
        return this.updatePost(postModel);
    }

    public void deletePost(PostModel postModel) {
        this.deletePost(postModel);
    }

    public void deletePost(Long id) {
        this.deletePost(id);
    }
}
