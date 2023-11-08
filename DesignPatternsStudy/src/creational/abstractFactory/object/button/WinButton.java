package creational.abstractFactory.object.button;

public class WinButton implements Button{
    @Override
    public void paint() {
        System.out.println("윈도우용 버튼을 렌더링 합니다.");
    }
}
