package com.company.NetflixFactory;

public class StandardFactory implements NetflixFactory{
    @Override
    public NetflixSubscription createSubscription() {
        return new StandardSubscription();
    }
}
