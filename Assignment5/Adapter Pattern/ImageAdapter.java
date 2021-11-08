package com.company.AdapterPattern;

public class ImageAdapter implements ImageView {

    private AnimateImgView animateImgView;

    public  ImageAdapter(String imgFormat){
        if(imgFormat.equals(".gif")){
            animateImgView = new GifView();
        }
    }

    @Override
    public void watchImage(String imgTitle, String imgFormat) {
            if(imgFormat.equals(".gif")){
                animateImgView.watchGif(imgTitle);
            }
    }

}
