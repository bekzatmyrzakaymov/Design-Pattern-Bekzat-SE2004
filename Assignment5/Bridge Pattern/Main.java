package com.company.Bridge;

public class Main {

    public static void main(String[] args) {

        Computer computer = new PC(new WindowsOS());
        computer.start();
        computer.browseInternet("https://google.com");

        System.out.println("-----------------------------");

        Computer laptop = new Laptop(new MacOS());
        laptop.start();
        laptop.browseInternet("https://google.com");
    }
}
