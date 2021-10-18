package com.company.SportAbstractFactory;

public class Boxing implements Sport{
    @Override
    public void sportName() {
        System.out.println("Boxing sport");
    }

    @Override
    public void nameOfSportsman() {
        System.out.println("Bekzat Myrzakassymov");
    }

    @Override
    public void country() {
        System.out.println("Kazakhstan, Nur-Sultan");
    }

    @Override
    public void age() {
        System.out.println("18 age ");
    }
}
