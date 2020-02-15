package ir.org.acm.session29.jpa.view;

import ir.org.acm.session29.jpa.biz.BankAccountFacade;

public class TestTransaction {

    public static void main(String[] args) {

        BankAccountFacade service = new BankAccountFacade();
        service.testTransaction();

    }

}
