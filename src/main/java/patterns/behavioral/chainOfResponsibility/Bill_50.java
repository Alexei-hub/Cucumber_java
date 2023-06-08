package patterns.behavioral.chainOfResponsibility;

public class Bill_50 extends GettingCash {

    private int getBill;

    public Bill_50(GettingCash gettingCash) {
        super(gettingCash);
    }

    @Override
    public void getCash(Account account) {
        getBill = account.getSummOnAccount() / 50;
        account.setSummOnAccount(account.getSummOnAccount() % 50);
        printCash(account);
        gettingCash.getCash(account);
    }

    @Override
    public void printCash(Account account) {
        System.out.println("you get " + getBill + " - 50 bill" + '\n' + "on your account leave "
                + account.getSummOnAccount());
    }
}
