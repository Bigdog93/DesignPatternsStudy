package creational.abstractFactory.object.checkbox;

public class MacCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("맥용 체크박스를 렌더링 합니다.");
    }
}
