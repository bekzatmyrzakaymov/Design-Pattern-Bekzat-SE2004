package com.company.FacadePattern;

public class Main {
    public static void main(String[] args) {
        TravelSystemFacade travelPackageFacade = new TravelSystemFacadeImp();
        travelPackageFacade.book();
    }
}
