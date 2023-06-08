package patterns.structural.adapter;


//помогает объединить два несовместимых объекта
public class Launch {
    public static void main(String[] args) {
        PBankAdapter pBankAdapter = new PBankAdapter(new ABank());
        pBankAdapter.getBalance();

    }
}
