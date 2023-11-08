package creational.abstractFactory.factory;


import creational.abstractFactory.object.button.Button;
import creational.abstractFactory.object.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
