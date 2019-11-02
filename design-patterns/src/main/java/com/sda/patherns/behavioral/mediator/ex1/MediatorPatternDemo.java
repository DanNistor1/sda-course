package com.sda.patherns.behavioral.mediator.ex1;

public class MediatorPatternDemo {

    public static void main(String[] args) {

        User robert = new User("Robert");
        robert.setMediator(new ChatRoom(robert));
        User john = new User("John");
        john.setMediator(new ChatRoom(john));

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
