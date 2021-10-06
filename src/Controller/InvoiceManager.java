package Controller;

import Model.Invoice;
import Model.User;

import java.time.LocalDate;
import java.util.ArrayList;

public class InvoiceManager implements IGeneral {
    static  ArrayList<Invoice> invoices = new ArrayList<>();
//     static   UserManager userManager = new UserManager();
//     static RoomManager roomManager = new RoomManager();

    static {
//        invoices.add(new Invoice(LocalDate.of(2021,9,5),LocalDate.of(2021,10,5), userManager, roomManager));
//        invoices.add(new Invoice(LocalDate.of(2021,9,5),LocalDate.of(2021,10,5), userManager, roomManager));
        invoices.add(new Invoice(LocalDate.now(),LocalDate.now(),"1","2"));
        invoices.add(new Invoice(LocalDate.now(),LocalDate.now(),"1","2"));
    }

    @Override
    public void showAll() {

    }

    @Override
    public int findById(String id) {
        return 0;
    }

    @Override
    public void addUser(Object i) {

    }

    @Override
    public void remove(int index) {

    }
}
