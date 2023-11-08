package creational.factoryMethod.product;

public class TriangleProduct implements Product{
    @Override
    public void doStuff() {
        System.out.println("삼각형 제품입니다.");
    }
}
