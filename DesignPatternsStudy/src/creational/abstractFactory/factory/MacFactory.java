package creational.abstractFactory.factory;

import creational.abstractFactory.object.button.Button;
import creational.abstractFactory.object.button.MacButton;
import creational.abstractFactory.object.checkbox.Checkbox;
import creational.abstractFactory.object.checkbox.MacCheckbox;

public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
