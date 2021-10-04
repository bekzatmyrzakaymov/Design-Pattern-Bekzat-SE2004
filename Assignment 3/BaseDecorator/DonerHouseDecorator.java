package com.company.myDecoratorExample.BaseDecorator;

import com.company.myDecoratorExample.Component.BekDonerHouse;

public class DonerHouseDecorator implements BekDonerHouse {

    BekDonerHouse bekDonerHouse;
    public DonerHouseDecorator(BekDonerHouse bekDonerHouse) {
        this.bekDonerHouse = bekDonerHouse;
    }

    @Override
    public String description() {
        return bekDonerHouse.description() ;
    }

    @Override
    public double cost() {
        return bekDonerHouse.cost() ;
    }

}
