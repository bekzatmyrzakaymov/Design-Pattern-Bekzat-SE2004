package com.company.AdapterPattern;

public class GifView implements AnimateImgView{
    @Override
    public void watchGif(String title) {
        System.out.println("Picture: " + title + ".gif");
    }
}
