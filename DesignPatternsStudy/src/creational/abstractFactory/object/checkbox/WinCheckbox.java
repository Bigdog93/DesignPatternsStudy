package creational.abstractFactory.object.checkbox;

public class WinCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("윈도우용 체크박스를 렌더링 합니다.");
    }
}
