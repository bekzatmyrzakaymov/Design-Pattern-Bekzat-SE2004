package com.company.myDecoratorExample.ConcreteComponent;

import com.company.myDecoratorExample.Component.BekDonerHouse;

public class DonerMix implements BekDonerHouse {
    @Override
    public String description() {
        return "Doner mix: 1090tg";
    }

    @Override
    public double cost() {
        return 1090;
    }
}
