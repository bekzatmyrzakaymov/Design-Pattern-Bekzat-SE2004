package com.company.AdapterPattern;

import java.util.Objects;

public class PictureView implements ImageView {
    @Override
    public void watchImage(String imgTitle, String imgFormat) {
        if(Objects.equals(imgFormat, ".jpeg")){
            System.out.println("Image: " + imgTitle + ".jpeg");
        }

        else if(imgFormat.equals(".png")) {
            System.out.println("Image: " + imgTitle + ".png");
        }

        else if(imgFormat.equals(".bmp")){
            System.out.println("Image: " + imgTitle + ".bmp");
        }

        else if(imgFormat.equals(".gif")){
            ImageAdapter imageAdapter = new ImageAdapter(imgFormat);
            imageAdapter.watchImage(imgTitle,imgFormat);
        }

        else{
            System.out.println("Format " + imgFormat + " not supported.");
        }
//
    }
}
