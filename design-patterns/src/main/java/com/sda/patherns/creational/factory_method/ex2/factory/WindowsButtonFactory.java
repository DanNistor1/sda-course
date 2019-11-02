package com.sda.patherns.creational.factory_method.ex2.factory;

import com.sda.patherns.creational.factory_method.ex2.button.Button;
import com.sda.patherns.creational.factory_method.ex2.button.WindowsButton;

public class WindowsButtonFactory extends Factory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
