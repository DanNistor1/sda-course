package com.sda.patherns.creational.factory_method.ex2;

import com.sda.patherns.creational.factory_method.ex2.factory.Factory;
import com.sda.patherns.creational.factory_method.ex2.factory.MacButtonFactory;
import com.sda.patherns.creational.factory_method.ex2.factory.WindowsButtonFactory;

public class Application {

    private static Factory factory;
    private static String string = System.getProperty("os.name").toLowerCase();

    public static void main(String[] args) {

        if (string.contains("windows")) {
            factory = new WindowsButtonFactory();
        } else {
            factory = new MacButtonFactory();
        }

        factory.paintWindow();
    }
}
