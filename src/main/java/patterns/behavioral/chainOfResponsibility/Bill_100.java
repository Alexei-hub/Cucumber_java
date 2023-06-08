package patterns.behavioral.chainOfResponsibility;

public class Bill_100 extends GettingCash {

    private int getBill;

    public Bill_100(GettingCash gettingCash) {
        super(gettingCash);
    }

    @Override
    public void getCash(Account account) {
        getBill = account.getSummOnAccount() / 100;
        account.setSummOnAccount(account.getSummOnAccount() % 100);
        printCash(account);
        gettingCash.getCash(account);
    }

    @Override
    public void printCash(Account account) {
        System.out.println("you get " + getBill + " - 100 bill" + '\n' + "on your account leave " + account.getSummOnAccount());
    }
}
