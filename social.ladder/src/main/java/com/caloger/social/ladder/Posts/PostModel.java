package com.caloger.social.ladder.Posts;

import com.caloger.social.ladder.Users.UserModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class PostModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String text;

    private UserModel author;

    private LocalDateTime postTime;

    public PostModel() {
    }

    public PostModel(long id, String text, UserModel author, LocalDateTime postTime) {
        this.id = id;
        this.text = text;
        this.author = author;
        this.postTime = postTime;
    }

    public PostModel(String text, UserModel author, LocalDateTime postTime) {
        this.text = text;
        this.author = author;
        this.postTime = postTime;
    }

    public PostModel(long id, String text, UserModel author) {
        this.id = id;
        this.text = text;
        this.author = author;
    }

    public PostModel(String text, UserModel author) {
        this.text = text;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public UserModel getAuthor() {
        return author;
    }

    public void setAuthor(UserModel author) {
        this.author = author;
    }

    public LocalDateTime getPostTime() {
        return postTime;
    }

    public void setPostTime(LocalDateTime postTime) {
        this.postTime = postTime;
    }

    @Override
    public String toString() {
        return "PostModel{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", author=" + author +
                ", postTime=" + postTime +
                '}';
    }
}
