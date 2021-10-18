package com.company.SportAbstractFactory;

public class Swimming implements Sport{
    @Override
    public void sportName() {
        System.out.println("Swimming sport");
    }

    @Override
    public void nameOfSportsman() {
        System.out.println("Dmitry Balandin");
    }

    @Override
    public void country() {
        System.out.println("Kazakhstan, Almaty");
    }

    @Override
    public void age() {
        System.out.println("26 age");
    }
}
