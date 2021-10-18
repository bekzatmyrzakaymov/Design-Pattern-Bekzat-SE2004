package com.company.SportAbstractFactory;

public class SwimmingFactory implements SportsmanAbstractFactory{
    @Override
    public Sport createSportsman() {
        return new Swimming();
    }

    @Override
    public Competition createCompetition() {
        return new AsianChampionship();
    }
}
