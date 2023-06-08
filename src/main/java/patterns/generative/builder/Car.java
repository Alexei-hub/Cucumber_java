package patterns.generative.builder;

import lombok.Getter;

@Getter
class Car {

    private String mark;
    private String model;
    private int year;
    private int maxSpeed;
    private int minSpeed;

    private Car(BuilderForCar builderForCar) {
        this.mark = builderForCar.mark;
        this.model = builderForCar.model;
        this.year = builderForCar.year;
        this.maxSpeed = builderForCar.maxSpeed;
        this.minSpeed = builderForCar.minSpeed;
    }

    static class BuilderForCar {
        private String mark;
        private String model;
        private int year;
        private int maxSpeed;
        private int minSpeed;

        public BuilderForCar(String mark, String model, int year) {
            this.mark = mark;
            this.model = model;
            this.year = year;
        }

        public BuilderForCar setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public BuilderForCar setMinSpeed(int minSpeed) {
            this.minSpeed = minSpeed;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}

