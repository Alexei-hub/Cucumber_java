package patterns.behavioral.momento;

public class Account {

    String name;
    int summ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSumm() {
        return summ;
    }

    public void setSumm(int summ) {
        this.summ = summ;
    }

    public Momento saveState() {
        return new Momento(this.name, this.summ);
    }

    public void getDataFromMomento(Momento momento) {
        this.name = momento.getName();
        this.summ = momento.getSumm();
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", summ=" + summ +
                '}';
    }
}
