package abstractFactory;

import abstractFactory.factory.GUIFactory;
import abstractFactory.factory.MacFactory;
import abstractFactory.factory.WinFactory;
import abstractFactory.object.button.Button;
import abstractFactory.object.checkbox.Checkbox;

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
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }



    public void paintButton() {
        button.paint();
    }
    public void paintCheckBox() {
        checkbox.paint();
    }
}
