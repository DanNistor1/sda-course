package com.sda.patherns.creational.abstract_factory.factory;

import com.sda.patherns.creational.abstract_factory.button.Button;
import com.sda.patherns.creational.abstract_factory.checkbox.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}
