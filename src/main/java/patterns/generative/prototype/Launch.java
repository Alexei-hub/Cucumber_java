package patterns.generative.prototype;

//Нужен для кеширования объекта путём его клонирования
public class Launch {
    public static void main(String[] args) throws CloneNotSupportedException {
        ClonedAccount clonedAccount = new ClonedAccount();
        clonedAccount.setAccount(new Account("Alex", 100000000));

        Account account = clonedAccount.getAccount();
        System.out.println(account);

    }
}
