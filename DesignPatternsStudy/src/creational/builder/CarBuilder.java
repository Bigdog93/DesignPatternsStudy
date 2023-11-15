package creational.builder;

public class CarBuilder implements Builder{
    private Car car;

    CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public CarBuilder seats(int num) {
        this.car.setSeats(num);
        return this;
    }

    @Override
    public CarBuilder engine(String engine) {
        this.car.setEngine(engine);
        return this;
    }

    @Override
    public CarBuilder tripDistance(int distance) {
        this.car.setTripDistance(distance);
        return this;
    }
    public Car build() {
        return this.car;
    }
}
