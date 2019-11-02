package com.sda.patherns.creational.singleton.naive_singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();

        //same instance
        System.out.println(object);
        System.out.println(SingleObject.getInstance());
        System.out.println(SingleObject.getInstance());
        System.out.println(SingleObject.getInstance());
    }

}
