package com.sda.grasp.controller;

public class DemoController {

    public static void main(String[] args) {

//        FrontController frontController = new FrontController(); // varianata initiala
        StudentView studentView = new StudentView();
        HomeView homeView = new HomeView();
        Dispatcher dispatcher = new Dispatcher(studentView, homeView);
        FrontController frontController = new FrontController(dispatcher);

        frontController.dispatchRequest("student");
        frontController.dispatchRequest("home");
    }
}
