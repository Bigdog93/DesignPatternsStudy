package creational.abstractFactory;

import creational.abstractFactory.factory.GUIFactory;
import creational.abstractFactory.factory.MacFactory;
import creational.abstractFactory.factory.WinFactory;
import creational.abstractFactory.object.button.Button;
import creational.abstractFactory.object.checkbox.Checkbox;

public class AbsFactoryApplication {
    private GUIFactory factory;
    private Button button;
    private Checkbox checkbox;
    public AbsFactoryApplication(FactoryCondition condition) {
        if(condition == FactoryCondition.MAC) {
            this.factory = new MacFactory();
        }else if(condition == FactoryCondition.WIN) {
            this.factory = new WinFactory();
        }
    }
    public void createButton() {
        this.button = factory.createButton();
    }
    public void createCheckBox() {
        this.checkbox = factory.createCheckbox();
    }
    public void paintButton() {
        button.paint();
    }
    public void paintCheckBox() {
        checkbox.paint();
    }
}
