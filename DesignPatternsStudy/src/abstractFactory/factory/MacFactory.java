package abstractFactory.factory;

import abstractFactory.object.button.Button;
import abstractFactory.object.button.MacButton;
import abstractFactory.object.checkbox.Checkbox;
import abstractFactory.object.checkbox.MacCheckbox;

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
