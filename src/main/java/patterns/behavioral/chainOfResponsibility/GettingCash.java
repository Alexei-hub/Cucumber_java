package patterns.behavioral.chainOfResponsibility;

public abstract class GettingCash implements Cash {
    GettingCash gettingCash;
    public GettingCash(GettingCash gettingCash) {
        this.gettingCash = gettingCash;
    }

    public abstract void printCash(Account account);

}
