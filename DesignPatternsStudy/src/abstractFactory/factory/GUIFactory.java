package abstractFactory.factory;


import abstractFactory.object.button.Button;
import abstractFactory.object.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
