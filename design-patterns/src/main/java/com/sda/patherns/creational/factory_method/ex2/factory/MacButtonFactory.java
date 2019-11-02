package com.sda.patherns.creational.factory_method.ex2.factory;

import com.sda.patherns.creational.factory_method.ex2.button.Button;
import com.sda.patherns.creational.factory_method.ex2.button.MacButton;

public class MacButtonFactory extends Factory {

    @Override
    public Button createButton() {
        return new MacButton();
    }
}

