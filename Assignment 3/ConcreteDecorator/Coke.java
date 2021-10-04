package com.company.myDecoratorExample.ConcreteDecorator;

import com.company.myDecoratorExample.Component.BekDonerHouse;
import com.company.myDecoratorExample.BaseDecorator.DonerHouseDecorator;

public class Coke extends DonerHouseDecorator {
    public Coke(BekDonerHouse bekDonerHouse) {
        super(bekDonerHouse);
    }

    @Override
    public String description() {
        return super.description() + "\nCoke:250tg ";
    }

    @Override
    public double cost() {
        return super.cost() + 250;
    }
}
