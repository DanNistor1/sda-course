package com.sda.reflection;

public class Person extends AbstractPerson implements PersonInterface {

    public String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @MyAnnotation(name = "someName", value = "Hello World")
    public void method1() {
        System.out.println("Method without argument.");
    }

    public void method2(int a) {
        System.out.println("Method with argument: " + a);
    }

    private void method3() {
        System.out.println("Private method3.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
