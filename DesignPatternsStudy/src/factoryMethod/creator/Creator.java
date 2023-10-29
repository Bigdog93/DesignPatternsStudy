package factoryMethod.creator;

import factoryMethod.product.Product;

public abstract class Creator {
// 크리에이터 클래스는 제품 클래스의 객체를 반환해야 하는 팩토리 메서드를 선언합니다.
// 크리에이터의 자식 클래스들은 일반적으로 이 메서드의 구현을 제공합니다.

    public abstract Product createProduct();
    // 크리에이터는 팩토리 메서드의 일부 디폴트 구현을 제공할 수도 있습니다.

    public void someOperation() {
        Product product = createProduct();
        product.doStuff();
    }
    // 크리에이터의 주 업무는 제품을 생성하는 것이 아닙니다.
    // 크리에이터는 일반적으로 팩토리 메서드에서 반환된 제품 객체에 의존하는 어떤 핵심 비즈니스 로직을 포함합니다.
    // 자식 클래스들은 팩토리 메서드를 오버라이드 한 후 해당 메서드에서 다른 유형의 제품을 반환하여 해당 비즈니스 로직을 간접적으로 변경할 수 있습니다.

}
