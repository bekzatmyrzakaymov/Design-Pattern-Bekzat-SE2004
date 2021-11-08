package com.company.AdapterPattern;

public class Main {

    public static void main(String[] args) {

        PictureView pictureView = new PictureView();
        pictureView.watchImage("photo1",".png");
        pictureView.watchImage("Aitu",".jpeg");
        pictureView.watchImage("design pattern",".gif");
        pictureView.watchImage("Adapter","jpj");

    }
}
