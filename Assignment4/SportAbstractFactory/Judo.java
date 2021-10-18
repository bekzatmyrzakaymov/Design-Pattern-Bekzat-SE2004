package com.company.SportAbstractFactory;

public class Judo implements Sport {
    @Override
    public void sportName() {
        System.out.println("Judo sport");
    }

    @Override
    public void nameOfSportsman() {
        System.out.println("Eldos Smetov");
    }

    @Override
    public void country() {
        System.out.println("Kazakhstan, Taraz");
    }

    @Override
    public void age() {
        System.out.println("28 age");
    }
}
