package com.company.myDecoratorExample;

import com.company.myDecoratorExample.Component.BekDonerHouse;
import com.company.myDecoratorExample.ConcreteComponent.BeefDoner;
import com.company.myDecoratorExample.ConcreteComponent.DonerMix;
import com.company.myDecoratorExample.ConcreteDecorator.Coke;
import com.company.myDecoratorExample.ConcreteDecorator.FrenchFries;
import com.company.myDecoratorExample.ConcreteDecorator.Souse;


public class Main {
    public static void main(String[] args) {

        System.out.println("Your receipt: ");
        BekDonerHouse bekDonerHouse = new Coke(new FrenchFries(new DonerMix()));
        System.out.println(bekDonerHouse.description() + " "+
                "\n"+
                "Total price: "+bekDonerHouse.cost() + " tenge");
        System.out.println("--------------------------------------");

        System.out.println("Your receipt: ");
        BekDonerHouse bekDonerHouse1 = new Coke(new FrenchFries(new Souse(new BeefDoner())));
        System.out.println(bekDonerHouse1.description() + " "+
                "\n"+
                "Total price: "+bekDonerHouse1.cost() + " tenge");

    }
}
