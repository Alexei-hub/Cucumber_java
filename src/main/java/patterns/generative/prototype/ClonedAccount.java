package patterns.generative.prototype;

public class ClonedAccount {
    private Account account;

    public Account getAccount() throws CloneNotSupportedException {
        return account.clone();
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}
