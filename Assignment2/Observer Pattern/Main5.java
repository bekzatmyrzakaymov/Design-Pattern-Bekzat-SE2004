package com.company.myExampleObserver;

public class Main5 {
    public static void main(String[] args) {

        InstagramPublisher ztbKz = new InstagramPublisher();
        InstagramPublisher tengriNews = new InstagramPublisher();

        ztbKz.addNewPost("Turkestan new city");
        tengriNews.addNewPost("The winner of the Grammy Music Award Imanbek KZ");

        InstagramUser instagramUser = new InstagramUser("myrza_bek03");
        instagramUser.setName("Bekzat");
        instagramUser.setStatus("AITU2023");

        ztbKz.registerUser(instagramUser);
        tengriNews.registerUser(instagramUser);

        ztbKz.addNewPost("Today is a great day in the Nur-sultan");
        tengriNews.addNewPost("Astana it");

        ztbKz.removePost("Today is a great day in the Nur-sultan");
        ztbKz.removeUSer(instagramUser);

        ztbKz.addNewPost("TOKIO 2020");

        System.out.println("Info user: "+instagramUser.toString());

    }
}
