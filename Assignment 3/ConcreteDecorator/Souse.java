package com.company.myDecoratorExample.ConcreteDecorator;

import com.company.myDecoratorExample.Component.BekDonerHouse;
import com.company.myDecoratorExample.BaseDecorator.DonerHouseDecorator;

public class Souse extends DonerHouseDecorator {
    public Souse(BekDonerHouse bekDonerHouse) {
        super(bekDonerHouse);
    }

    @Override
    public String description() {
        return super.description() + "\nKetchup: 100tg";
    }

    @Override
    public double cost() {
        return super.cost() + 100;
    }
}
