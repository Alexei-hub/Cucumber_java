package patterns.behavioral.momento;


// сохраняет состояние объекта(оект можно вернуть к исходному состоянию в любой момент )
// Позволяет сохранить текущее состояние объекта, позже это состояние можно восстановить. Не нарушает инкапсуляцию.

public class Launch {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Alex");
        account.setSumm(10000000);
        System.out.println(account);
        Momento momento = account.saveState();
        account.setName("Anna");
        account.setSumm(213452315);
        System.out.println(account);
        account.getDataFromMomento(momento);
        System.out.println(account);
    }
}
