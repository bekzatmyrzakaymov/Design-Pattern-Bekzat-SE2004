package com.company.iceCream;

public class IceOfType extends IceCream{

    public IceOfType(){
        tasteBehavior=new CreamyBehavior();
        powderedBehavior=new SugarPowdered();
    }
}
