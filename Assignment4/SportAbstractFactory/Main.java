package com.company.SportAbstractFactory;

public class Main {

    public static void main(String[] args) {

        SportsmanAbstractFactory factory = new BoxingFactory();

        Sport sportsman = factory.createSportsman();
        Competition sport1 = factory.createCompetition();

        sportsman.sportName();
        sportsman.nameOfSportsman();
        sportsman.country();
        sportsman.age();
        sport1.competitionName();

        System.out.println("-----------------------------");

        SportsmanAbstractFactory factory1 = new JudoFactory();

        Sport sportsman2 = factory1.createSportsman();
        Competition competition = factory1.createCompetition();

        sportsman2.sportName();
        sportsman2.nameOfSportsman();
        sportsman2.country();
        competition.competitionName();

    }

}
