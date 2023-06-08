package patterns.structural.adapter;

public class PBank implements Visa {
    private int balance;

    public PBank() {
        balance = 100;
    }

    public void getBalance(Visa visa) {
        visa.verifyVisa();
        System.out.println("PBank balance = " + balance);
    }

    @Override
    public void verifyVisa() {
        System.out.println("verifying that visa");
    }
}
