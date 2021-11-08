package com.company.Bridge;

public abstract class Computer {

    OperatingSystem os;

    public Computer(OperatingSystem os) {
        this.os = os;
    }

    public abstract void start();
    public abstract void browseInternet(String url);

}
