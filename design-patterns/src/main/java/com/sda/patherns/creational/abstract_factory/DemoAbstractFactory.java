package com.sda.patherns.creational.abstract_factory;

import com.sda.patherns.creational.abstract_factory.factory.GUIFactory;
import com.sda.patherns.creational.abstract_factory.factory.MacFactory;
import com.sda.patherns.creational.abstract_factory.factory.WinFactory;

public class DemoAbstractFactory {

    private static Application app;
    private static GUIFactory factory;
    private static String osName = System.getProperty("os.name").toLowerCase();

    public static void main(String[] args) {

        if (osName.contains("mac")) {
            factory = new MacFactory();
            app = new Application(factory);
        } else {
            factory = new WinFactory();
            app = new Application(factory);
        }

        app.createUI();
        app.paint();

    }
}

