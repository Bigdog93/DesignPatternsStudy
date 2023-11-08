package creational.abstractFactory.object.button;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("맥용 버튼을 렌더링 합니다.");
    }
}
