package com.company.myExampleObserver;

import java.util.List;

public class InstagramUser implements Observer {
    private String nickname;
    private String name;
    private String status;

    public InstagramUser(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void update(List<String> post) {
        System.out.println("Dear " + nickname + "you can see " + post);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "InstagramUser{" +
                "nickname='" + nickname + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
