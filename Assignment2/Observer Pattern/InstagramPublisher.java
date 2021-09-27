package com.company.myExampleObserver;
import java.util.ArrayList;

public class InstagramPublisher implements Observable{
    private final ArrayList<String> InstagramPost = new ArrayList<>();
    private final ArrayList<InstagramUser> user = new ArrayList<>();

    public void addNewPost(String post){
        this.InstagramPost.add(post);
        notifyAllUsers();
    }

    public void removePost(String post){
        this.InstagramPost.remove(post);
        notifyAllUsers();
    }

    @Override
    public void registerUser(InstagramUser user) {
        this.user.add(user);
    }

    @Override
    public void removeUSer(InstagramUser user) {
        this.user.remove(user);
    }

    @Override
    public void notifyAllUsers() {
        for (InstagramUser user: user) {
            user.update(this.InstagramPost);
        }
    }
}
