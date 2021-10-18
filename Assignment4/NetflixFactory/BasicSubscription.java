package com.company.NetflixFactory;

public class BasicSubscription implements NetflixSubscription{

    @Override
    public void nameSubscription() {
        System.out.println("Basic subscription");
    }

    @Override
    public void price() {
        System.out.println("Cost per month: 7,99 €");
    }

    @Override
    public void videoQuality() {
        System.out.println("Good quality: 480p");
    }

}
