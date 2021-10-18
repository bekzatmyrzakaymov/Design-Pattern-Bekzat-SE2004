package com.company.NetflixFactory;

public class PremiumSubscription implements NetflixSubscription{
    @Override
    public void nameSubscription() {
        System.out.println("Premium subscription");
    }

    @Override
    public void price() {
        System.out.println("Cost per month: 11,99 €");
    }

    @Override
    public void videoQuality() {
        System.out.println("best quality: 4k+HDR");

    }
}
