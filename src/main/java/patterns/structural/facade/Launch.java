package patterns.structural.facade;

//Своего рода инкапсуляция
//Скрывает сложную систему классов приводя все вызовы к одному объекту.
// Помещает вызов нескольких сложных объектов в один объект.
public class Launch {

    public static void main(String[] args) {
        Facade facade = new Facade(new AQA(), new Developer());
        facade.getTask();
        facade.writeCode();
    }
}
