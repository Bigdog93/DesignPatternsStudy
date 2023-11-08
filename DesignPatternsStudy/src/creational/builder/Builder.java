package creational.builder;

public interface Builder {
    void reset();
    Builder seats(int num);
    Builder engine(String engine);
    Builder tripDistance(int distance);
}
