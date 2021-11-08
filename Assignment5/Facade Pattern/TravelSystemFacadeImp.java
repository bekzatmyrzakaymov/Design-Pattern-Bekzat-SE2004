package com.company.FacadePattern;

public class TravelSystemFacadeImp implements TravelSystemFacade {
    @Override
    public void book() {
        BookHotel bookHotel = new BookHotel();
        bookHotel.bookHotel();

        BookFlight flight = new BookFlight();
        flight.bookFlight();

        BookTransfer bookTransfer = new BookTransfer();
        bookTransfer.bookTransport();

        System.out.println("----------------------'" +
                "\n" +
                "Travel system booked Successfully!!!");
    }
}
