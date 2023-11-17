package ru.geekbrains.lesson5;

import ru.geekbrains.lesson5.models.TableModel;
import ru.geekbrains.lesson5.presenters.BookingPresenter;
import ru.geekbrains.lesson5.views.BookingView;

import java.util.Date;

public class Program {

    //TO DO: Метод changeReservationTable должен заработать!
    public static void main(String[] args) {

        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.updateTablesUI();
        bookingView.reservationTable(new Date(), 3, "Станислав");
        bookingView.reservationTable(new Date(), 1, "Жандарбек");
        bookingView.reservationTable(new Date(), 2, "Евгений");
        bookingView.reservationTable(new Date(), 4, "Ботагоз");

        bookingView.changeReservationTable(1009, new Date(), 5, "Ботагоз");
        bookingView.changeReservationTable(1001, new Date(), 5, "Станислав");

    }

}
