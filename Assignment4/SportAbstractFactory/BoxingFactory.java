package com.company.SportAbstractFactory;

public class BoxingFactory implements SportsmanAbstractFactory{
    @Override
    public Sport createSportsman() {
        return new Boxing();
    }

    @Override
    public Competition createCompetition() {
        return new WorldChampionShip();
    }
}
