package com.company.NetflixFactory;

public class Main {

    public static void main(String[] args) {

        NetflixFactory netflixFactory = new BasicFactory();
        NetflixSubscription netflixSubscription = netflixFactory.createSubscription();

        netflixSubscription.nameSubscription();
        netflixSubscription.videoQuality();
        netflixSubscription.price();

        System.out.println("-----------------------------");

        NetflixFactory factory = new PremiumFactory();
        NetflixSubscription subscription = factory.createSubscription();
        subscription.nameSubscription();
        subscription.videoQuality();
        subscription.price();

    }
}
