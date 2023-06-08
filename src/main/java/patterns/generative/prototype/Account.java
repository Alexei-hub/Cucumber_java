package patterns.generative.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account implements Cloneable {
    private String name;
    private int sum;

    public Account(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    @Override
    protected Account clone() throws CloneNotSupportedException {
        return (Account) super.clone();
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", sum=" + sum +
                '}';
    }
}
