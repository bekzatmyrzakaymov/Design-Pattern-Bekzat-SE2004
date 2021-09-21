package com.company.iceCream;

public abstract class IceCream {

    TasteBehavior tasteBehavior;
    PowderedBehavior powderedBehavior;
    public  IceCream(){

    }

    public IceCream(TasteBehavior tasteBehavior, PowderedBehavior powderedBehavior) {
        this.tasteBehavior = tasteBehavior;
        this.powderedBehavior = powderedBehavior;
    }

    public void makeIceCream(){
        this.tasteBehavior.tasteOfIceCream();
    }

    public void addPowdered(){
        this.powderedBehavior.powderedIceCream();
    }


    public void setTasteBehavior(TasteBehavior tasteBehavior) {
        this.tasteBehavior = tasteBehavior;
    }

    public TasteBehavior getTasteBehavior() {
        return tasteBehavior;
    }

    public PowderedBehavior getPowderedBehavior() {
        return powderedBehavior;
    }

    public void setPowderedBehavior(PowderedBehavior powderedBehavior) {
        this.powderedBehavior = powderedBehavior;
    }
}
