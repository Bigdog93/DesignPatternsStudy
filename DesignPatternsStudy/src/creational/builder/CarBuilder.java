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
    public Builder seats(int num) {
        this.car.setSeats(num);
        return this;
    }

    @Override
    public Builder engine(String engine) {
        this.car.setEngine(engine);
        return this;
    }

    @Override
    public Builder tripDistance(int distance) {
        this.car.setTripDistance(distance);
        return this;
    }
    public Car build() {
        return this.car;
    }
}
