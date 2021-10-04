package com.company.myDecoratorExample.ConcreteDecorator;

import com.company.myDecoratorExample.Component.BekDonerHouse;
import com.company.myDecoratorExample.BaseDecorator.DonerHouseDecorator;

public class TurkishKefir extends DonerHouseDecorator {
    public TurkishKefir(BekDonerHouse bekDonerHouse) {
        super(bekDonerHouse);
    }

    @Override
    public String description() {
        return super.description() + "\n Turkish kefir: 300tg";
    }

    @Override
    public double cost() {
        return super.cost() + 300;
    }

}
