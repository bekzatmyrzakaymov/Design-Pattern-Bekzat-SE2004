package com.company.NetflixFactory;

public class BasicFactory implements NetflixFactory{
    @Override
    public NetflixSubscription createSubscription() {
        return new BasicSubscription();
    }
}
