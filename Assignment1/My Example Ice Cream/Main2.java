package com.company.iceCream;

public class Main2 {

    public static void main(String[] args) {
        IceCream glassOfType = new GlassOfType();

        glassOfType.makeIceCream();
        glassOfType.addPowdered();

        glassOfType.setTasteBehavior(new CreamyBehavior());
        glassOfType.setPowderedBehavior(new CocoaPowder());

        System.out.println("---------------------");
        glassOfType.makeIceCream();
        glassOfType.addPowdered();

        IceCream iceCreanOnStick = new IceCreamOnStick();

        System.out.println("------------------------");
        iceCreanOnStick.makeIceCream();
        iceCreanOnStick.addPowdered();
    }
}
