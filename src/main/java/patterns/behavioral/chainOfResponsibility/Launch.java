package patterns.behavioral.chainOfResponsibility;


//обработка запроса несколькими объектами, которые соеденены в одну цепочку
public class Launch {
    public static void main(String[] args) {
        Account account = new Account();
        account.setSummOnAccount(373);

        Bill_10 bill_10 = new Bill_10(null);
        Bill_50 bill_50 = new Bill_50(bill_10);
        Bill_100 bill_100 = new Bill_100(bill_50);
        bill_100.getCash(account);

//        GettingCash gettingCash = new Bill_100(new Bill_50(new Bill_10(null)));
//        gettingCash.getCash(account);


    }
}
