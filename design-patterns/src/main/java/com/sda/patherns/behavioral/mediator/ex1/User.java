package com.sda.patherns.behavioral.mediator.ex1;

public class User {

    private Mediator mediator;
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        mediator.showMessage(message);
    }
}
