package com.company.NetflixFactory;

public class PremiumFactory implements NetflixFactory{
    @Override
    public NetflixSubscription createSubscription() {
        return new PremiumSubscription();
    }
}
