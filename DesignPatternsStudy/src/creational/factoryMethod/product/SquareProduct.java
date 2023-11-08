package creational.factoryMethod.product;

public class SquareProduct implements Product{
    @Override
    public void doStuff() {
        System.out.println("사각형 제품입니다.");
    }
}
