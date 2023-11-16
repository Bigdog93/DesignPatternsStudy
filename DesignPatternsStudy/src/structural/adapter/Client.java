package structural.adapter;

// 프로그램의 기존 비즈니스 로직을 포함하는 클래스
public class Client implements ClientInterface {
    @Override
    public void method(int data) {
        System.out.println("기존 시스템의 method 입니다.");
    }
}
