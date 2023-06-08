package patterns.structural.adapter;

public class PBankAdapter extends PBank {
    private final ABank aBank;

    public PBankAdapter(ABank abank) {
        this.aBank = abank;
    }

    public void getBalance() {
        aBank.getBalance();
    }
}
