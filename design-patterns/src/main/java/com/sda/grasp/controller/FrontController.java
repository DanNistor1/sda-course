package com.sda.grasp.controller;

public class FrontController {

    public Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    public FrontController(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    public void dispatchRequest(String request) {

        trackRequest(request);
        if(isAuthenticUser()){
//            dispatcher = new Dispatcher(); // varianta initiala
            dispatcher.dispatch(request);
        }
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }
}
