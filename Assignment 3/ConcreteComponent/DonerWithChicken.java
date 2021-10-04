package com.company.myDecoratorExample.ConcreteComponent;

import com.company.myDecoratorExample.Component.BekDonerHouse;

public class DonerWithChicken implements BekDonerHouse {
    @Override
    public String description() {
        return "Doner with chiken: 790tg";
    }

    @Override
    public double cost() {
        return 790;
    }
}
