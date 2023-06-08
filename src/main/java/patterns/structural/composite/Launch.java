package patterns.structural.composite;

//Группирует несколько объектов в древовидную структуру используя один класс.
//Позволяет работать с несколькими классами через один объект.
public class Launch {
    public static void main(String[] args) {
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        MiddleDeveloper middleDeveloper = new MiddleDeveloper();
        Developing developing = new Developing();
        developing.addDevelop(juniorDeveloper);
        developing.addDevelop(middleDeveloper);
        developing.writeCode("search");

    }
}
