package com.company.Bridge;

public class Laptop extends Computer{

    public Laptop(OperatingSystem os) {
        super(os);
    }

    @Override
    public void start() {
        os.startup();
    }

    @Override
    public void browseInternet(String url) {
        os.loadUrl(url);
    }

}
