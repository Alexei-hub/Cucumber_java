package patterns.behavioral.chainOfResponsibility;

public class Bill_10 extends GettingCash{
    private int getBill;

    public Bill_10(GettingCash gettingCash) {
        super(gettingCash);
    }

    @Override
    public void getCash(Account account) {
        getBill = account.getSummOnAccount() / 10;
        account.setSummOnAccount(account.getSummOnAccount() % 10);
        printCash(account);
    }

    @Override
    public void printCash(Account account) {
        System.out.println("you get " + getBill + " - 10 bill" + '\n' + "on your account leave " + account.getSummOnAccount());
    }
}
