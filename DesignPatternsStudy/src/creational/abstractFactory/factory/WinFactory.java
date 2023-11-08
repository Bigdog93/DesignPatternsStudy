package creational.abstractFactory.factory;

import creational.abstractFactory.object.button.Button;
import creational.abstractFactory.object.button.WinButton;
import creational.abstractFactory.object.checkbox.Checkbox;
import creational.abstractFactory.object.checkbox.WinCheckbox;

public class WinFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
