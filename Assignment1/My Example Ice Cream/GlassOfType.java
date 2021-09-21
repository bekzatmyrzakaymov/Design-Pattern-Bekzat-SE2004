package com.company.iceCream;

public class GlassOfType extends IceCream{

    public GlassOfType(){
        tasteBehavior=new ChocolateBehavior();
        powderedBehavior=new PowderedWithNuts();
    }
}
