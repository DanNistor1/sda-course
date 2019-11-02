package com.sda.patherns.creational.abstract_factory.button;

public class WinButton implements Button {

    @Override
    public void paint() {
        // Render a button in Windows style
        System.out.println("paint windows button");
    }
}
