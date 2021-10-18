package com.company.NetflixFactory;

public class StandardSubscription implements NetflixSubscription{
    @Override
    public void nameSubscription() {
        System.out.println("Standard subscription");
    }

    @Override
    public void price() {
        System.out.println("Cost per month: 9,99 €");
    }

    @Override
    public void videoQuality() {
        System.out.println("best quality: 1080p");
    }
}
