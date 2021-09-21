package com.company.iceCream;

public class IceCreamOnStick extends IceCream{

    public IceCreamOnStick(){
        tasteBehavior=new StrawberryBehavior();
        powderedBehavior=new CocoaPowder();
    }
}
