package patterns.behavioral.momento;

public class Momento {

    String name;
    int summ;

    public Momento(String name, int summ) {
        this.name = name;
        this.summ = summ;
    }

    public String getName() {
        return name;
    }

    public int getSumm() {
        return summ;
    }

}
