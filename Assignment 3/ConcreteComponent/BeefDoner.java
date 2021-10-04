package com.company.myDecoratorExample.ConcreteComponent;

import com.company.myDecoratorExample.Component.BekDonerHouse;

public class BeefDoner implements BekDonerHouse {
    @Override
    public String description() {
        return "Beef Doner: 890tg ";
    }

    @Override
    public double cost() {
        return 890;
    }
}
