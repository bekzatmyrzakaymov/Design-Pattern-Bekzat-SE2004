package com.company.Bridge;

public class PC extends Computer{

    public PC(OperatingSystem os) {
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
