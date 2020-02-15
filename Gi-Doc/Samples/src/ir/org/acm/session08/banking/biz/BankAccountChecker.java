package ir.org.acm.session08.banking.biz;

import ir.org.acm.session08.banking.controller.BankAccountController;
import ir.org.acm.session08.banking.entity.BankAccount;

public class BankAccountChecker {

    public boolean canTransfer(int sourceAccountNumber, int destAccountNumber, long transferAmount) {

        boolean flag = true;

        BankAccountController controller = new BankAccountController();
        BankAccount srcAccount = controller.findByNumber(sourceAccountNumber);
        BankAccount destAccount = controller.findByNumber(destAccountNumber);
        if (srcAccount == null || destAccount == null) {
            flag = false;
        }
        else
            if (srcAccount.getBalance() < transferAmount) flag = false;

        return flag;
    }

}
