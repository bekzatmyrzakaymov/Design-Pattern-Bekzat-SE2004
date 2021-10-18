package com.company.SportAbstractFactory;

public class JudoFactory implements SportsmanAbstractFactory{
    @Override
    public Sport createSportsman() {
        return new Judo();
    }

    @Override
    public Competition createCompetition() {
        return new Olympiad();
    }
}
