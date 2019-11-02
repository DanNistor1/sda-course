package com.sda.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class ReflectionDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException,
            InstantiationException, NoSuchFieldException {

        // Creating object whose property is to be checked
        Person obj = new Person();

        // Creating class object from the object using
        // getclass method
        Class cls = obj.getClass();
        System.out.println("The name of class is " + cls.getName());
        System.out.println("The name of superclass is " + cls.getSuperclass());
        System.out.println("The name of interface is " + cls.getInterfaces()[0]);
        System.out.println();

        // Getting the constructors of the class through the object of the class
        // and parameters of constructors
        Constructor[] constructors = cls.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("The name of constructor is " + constructor.getName());
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class cl : parameterTypes)
                System.out.println("The parameters of constructor are " + cl);
            System.out.println();
        }

        // Instantiating object using constructor object
        Constructor constructor = Person.class.getConstructor(String.class, int.class);
        Person person = (Person) constructor.newInstance("dan", 30);
        System.out.println(person);
        System.out.println();

        // Getting the methods of the class through the object of the class
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods)
            System.out.println("The name of method is " + method.getName());
        System.out.println();

        // Getting the fields
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("The name of field is " + field.getName());
            System.out.println("is field private " + Modifier.isPrivate(
                    field.getModifiers()));
        }
        System.out.println();

        // Getting the annotations
        Method method1 = cls.getDeclaredMethod("method1");
        Annotation[] annotations = method1.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof MyAnnotation) {
                MyAnnotation myAnnotation = (MyAnnotation) annotation;
                System.out.println("name: " + myAnnotation.name());
                System.out.println("value: " + myAnnotation.value());
            }
        }
        System.out.println();

        // Create object of the desired method by providing the method name and parameter class
        // as arguments to the getDeclarateMethod
        Method method2 = cls.getDeclaredMethod("method2", int.class);
        // invokes the method at runtime
        method2.invoke(obj, 20);
        System.out.println();

        // Create object of private method
        Method method3 = cls.getDeclaredMethod("method3");
        // allows the object to access the method irrespective of the access specifier
        method3.setAccessible(true);
        // invokes the method at runtime
        method3.invoke(obj);
        System.out.println();

        // Create object of private field
        Field field = cls.getDeclaredField("age");
        // allows the object to access the field irrespective of the access specifier
        field.setAccessible(true);
        // takes object and new value to be assigned to the field as argument
        field.set(obj, 50);
        System.out.println("Noua varsta: " + obj.getAge());

    }
}
