package creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
//        Car car = new CarBuilder().seats(5).tripDistance(0).engine("t").build();
//        Car car = builder.seats(3).engine("V8").tripDistance(0);
        Car car = Car.builder().seats(4).engine("I4").tripDistance(0).build();
        System.out.println("엔진구조 : " + car.getEngine());
        System.out.println("좌석 수 : " + car.getSeats());
        System.out.println("주행거리 : " + car.getTripDistance());
    }
}
