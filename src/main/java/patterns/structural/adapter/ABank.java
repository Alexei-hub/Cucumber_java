package patterns.structural.adapter;

public class ABank implements Master {
    private int balance;

    public ABank() {
        balance = 200;
    }

    public void getBalance() {
        verifyMaster();
        System.out.println("ABank balance = " + balance);
    }

    @Override
    public void verifyMaster() {
        System.out.println("verifying that master");
    }
}
