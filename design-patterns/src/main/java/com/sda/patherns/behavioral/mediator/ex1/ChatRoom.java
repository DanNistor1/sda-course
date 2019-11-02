package com.sda.patherns.behavioral.mediator.ex1;

import java.util.Date;

public class ChatRoom implements Mediator {

    private User user;

    public ChatRoom(User user) {
        this.user = user;
    }

    @Override
    public void showMessage(String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
