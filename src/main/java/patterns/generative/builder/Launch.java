package patterns.generative.builder;


//Для создание сложных объектов с большим количеством конструкторов
public class Launch {
    public static void main(String[] args) {
        Car car = new Car.BuilderForCar("BMW", "5", 2020).setMaxSpeed(300).build();
        System.out.println(car.getMark());
        System.out.println(car.getModel());
        System.out.println(car.getMaxSpeed());
    }
}
