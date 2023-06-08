package patterns.generative.factoryMethod;

import patterns.generative.factoryMethod.develop.DeveloperFactory;


//своего рода скрытый конструктор для фабрики
public class Launch {
    public static void main(String[] args) {
        String developer = DeveloperFactory.choose("java");
        System.out.println(developer);
    }
}
