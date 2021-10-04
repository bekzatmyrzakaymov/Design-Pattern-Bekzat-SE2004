package com.company.myDecoratorExample.ConcreteDecorator;

import com.company.myDecoratorExample.Component.BekDonerHouse;
import com.company.myDecoratorExample.BaseDecorator.DonerHouseDecorator;

public class FrenchFries extends DonerHouseDecorator {
    public FrenchFries(BekDonerHouse bekDonerHouse) {
        super(bekDonerHouse);
    }

    @Override
    public String description() {
        return super.description() + "\nFrench fries: 300tg";
    }

    @Override
    public double cost() {
        return super.cost() + 300;
    }
}
