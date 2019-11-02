package com.sda.patherns.creational.factory_method.ex2.factory;

import com.sda.patherns.creational.factory_method.ex2.button.Button;

public abstract class Factory {

    public void paintWindow(){
        Button button = createButton();
        button.paint();
    }

    abstract Button createButton();
}
