package abstractFactory.factory;

import abstractFactory.object.button.Button;
import abstractFactory.object.button.WinButton;
import abstractFactory.object.checkbox.Checkbox;
import abstractFactory.object.checkbox.WinCheckbox;

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
