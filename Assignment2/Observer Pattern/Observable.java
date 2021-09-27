package com.company.myExampleObserver;

public interface Observable {
    void registerUser(InstagramUser user);
    void removeUSer(InstagramUser user);
    void notifyAllUsers();
}
